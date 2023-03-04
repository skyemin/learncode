package com.wei.learncode.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Objects;

public class Test {

    public static void main(String[] args) {

        final String fileName = "test.txt";
        final String filePath = "d:\\test.txt";
        File file = new File(filePath);
        String parent = file.getParent();
        System.out.println(parent); // 获取到的是目录

        // 注册监听服务
        WatchService watchService;
        try {
            watchService = FileSystems.getDefault().newWatchService();
            Path path = Paths.get(parent);
            WatchKey wk = path.register(watchService,
                    StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_MODIFY,
                    StandardWatchEventKinds.ENTRY_DELETE);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // 监听修改线程：目录下的所有监听项都会在这里响应，所以要根据文件名来区分
        Thread wThread = new Thread(() -> {
            while (true) {
                try {
                    WatchKey watchKey = watchService.take();
                    for (WatchEvent<?> pollEvent : watchKey.pollEvents()) {
                        String eventName = pollEvent.context().toString();
                        if(StandardWatchEventKinds.ENTRY_CREATE == pollEvent.kind()){
                            System.out.println("新增:"+eventName);
                        }
                        if(StandardWatchEventKinds.ENTRY_MODIFY == pollEvent.kind()){
                            System.out.println("修改:"+eventName);
                        }
                        if(StandardWatchEventKinds.ENTRY_DELETE == pollEvent.kind()){
                            System.out.println("删除:"+eventName);
                        }
                        System.out.println(eventName);
                    }
                    watchKey.reset(); // 必须重置监视Key

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        // wThread.setDaemon(true); // 守护进程
        wThread.start();

        // 注册关闭钩子
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                watchService.close();
                System.out.println("文件监听钩子已关闭");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));

    }

}
