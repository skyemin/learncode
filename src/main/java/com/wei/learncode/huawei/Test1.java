package com.wei.learncode.huawei;

import java.util.Scanner;

public class Test1 {


    public static String ipToNum(String address){
        String[] split = address.split("\\#");
        if(split.length != 4){
            return "invalid IP";
        }
        long res = 0;
        for (int i = 0; i < 4; i++) {
            try {
                int value = Integer.parseInt(split[i]);
                if(value < 0 || value > 255){
                    return "invalid IP";
                }
                //转成二进制 按位或
                res = (res << 8) | value;
            }catch (Exception e){
                return "invalid IP";
            }
        }
        return String.valueOf(res);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String address = in.nextLine();
            System.out.println(ipToNum(address));
        }
    }
}
