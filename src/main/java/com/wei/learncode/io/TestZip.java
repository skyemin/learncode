package com.wei.learncode.io;

import java.io.*;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @Author: skye
 * @Date: 2019/12/2 11:23
 * @Description:
 * @Version:1.0
 */
public class TestZip {

    public static void zipFileNoBuffer() {
        File zipFile = new File("d:/aaaaa.zip");
        try
        {
            ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
            //开始时间
            long beginTime = System.currentTimeMillis();

            for (int i = 0; i < 10; i++) {
                try (InputStream input = new FileInputStream("d:/test.jpg")) {
                    zipOut.putNextEntry(new ZipEntry("test" + i + ".jpg"));
                    int temp = 0;
                    while ((temp = input.read()) != -1) {
                        zipOut.write(temp);
                    }
                }
            }
            //结束时间
            long endTime = System.currentTimeMillis();
            System.out.println("消耗时间:"+(endTime-beginTime)+"毫秒");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void zipFileBuffer() {
        File zipFile = new File("d:/aaaaa.zip");
        try
        {
            ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(zipOut);
            //开始时间
            long beginTime = System.currentTimeMillis();
            for (int i = 0; i < 10; i++) {
                try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("d:/test.jpg"))) {
                    zipOut.putNextEntry(new ZipEntry("test" + i + ".jpg"));
                    int temp = 0;
                    while ((temp = bufferedInputStream.read()) != -1) {
                        bufferedOutputStream.write(temp);
                    }
                }
            }
            //结束时间
            long endTime = System.currentTimeMillis();
            System.out.println("消耗时间:"+(endTime-beginTime)+"毫秒");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void zipFileChannel() {
        //开始时间
        long beginTime = System.currentTimeMillis();
        File zipFile = new File("d:/aaaaa.zip");
        try (ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
             WritableByteChannel writableByteChannel = Channels.newChannel(zipOut)) {
            for (int i = 0; i < 10; i++) {
                try (FileChannel fileChannel = new FileInputStream("d:/test.jpg").getChannel()) {
                    zipOut.putNextEntry(new ZipEntry(i + ".jpg"));
                    fileChannel.transferTo(0,100000000 , writableByteChannel);
                }
            }
            //结束时间
            long endTime = System.currentTimeMillis();
            System.out.println("消耗时间:"+(endTime-beginTime)+"毫秒");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        //zipFileNoBuffer();
        //zipFileBuffer();
        zipFileChannel();
    }
}
