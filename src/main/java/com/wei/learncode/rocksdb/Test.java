package com.wei.learncode.rocksdb;

import org.apache.commons.io.FilenameUtils;
import org.rocksdb.Options;
import org.rocksdb.RocksDB;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/4 16:28
 */
public class Test {
    static{
        RocksDB.loadLibrary();
    }
    static RocksDB rocksDB;
    static String path = FilenameUtils.concat("D:\\test", "aaa");;
    public static void main(String[] args) throws Exception {
        Options options = new Options();
        options.setCreateIfMissing(true);
        rocksDB = RocksDB.open(options, path);
        rocksDB.put("key".getBytes(),"张三".getBytes());
        byte[] bytes = rocksDB.get("key".getBytes());
        String res = new String(bytes,"UTF-8");
        System.out.println(res);
    }
}
