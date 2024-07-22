package com.wei.learncode;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author skye
 * @version 1.0
 * @date Created in 2021年10月20日 14:33
 * @since 1.0
 */
public class Testm {

    public String name = "a";

    public static void main(String[] args) {
        System.out.println(generateByRandom(10));
    }

    /**
     * 初始化 62 进制数据，索引位置代表字符的数值，比如 A代表10，z代表61等
     */
    private final static String ALL_CHARS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private final static int SCALE = 62;

    /**
     * 生成数字和字母组合，字母区分大小写
     *
     * @param length shortSuffix的长度
     * @return
     */
    public static String generateByRandom(final int length) {
        StringBuilder randomSb = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            randomSb.append(ALL_CHARS.charAt(random.nextInt(SCALE)));
        }
        return randomSb.toString();
    }
}

class B extends Testm{
}
