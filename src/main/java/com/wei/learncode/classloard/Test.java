package com.wei.learncode.classloard;

/**
 * @Author: weizz
 * @Date: 2019/4/29 9:55
 * @Description:
 * @Version:1.0
 */
public class Test {
    private static Test test = new Test();
    static {
        a =1;
    }
    private static int a = 0;
    private static int b;
    private Test(){
        a++;
        b++;
    }

    public static void main(String[] args) {
        String a  = "123";
        a = "456";
        System.out.println(a);
        System.out.println(b);
        ClassLoader classLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                return super.loadClass(name);
            }
        };
    }
}
