package com.wei.learncode.genericity;

import lombok.ToString;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//泛型类
@ToString
public class IdGen<T> {
    private T id;

    public IdGen(T id) {
         this.id = id;
    }

    @ToString
    static class User extends  IdGen<Integer>{

        public User(Integer id) {
            super(id);
        }
    }
    public static <T> Map obj2Map(T obj) throws Exception {
        Map map = new HashMap<>();

        // 获取所有字段：通过 getClass() 方法获取 Class 对象，然后获取这个类所有字段
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            // 开放字段操作权限
            field.setAccessible(true);
            // 设置值
            map.put(field.getName(), field.get(obj));
        }

        return map;
    }
    public static void print(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static <T> void print1(T obj) {
        System.out.println(obj instanceof Integer);
        System.out.println(obj);
    }
    public static void main(String[] args) {
        /*User user = new User(2);
        System.out.println(user.toString());

        IdGen idGen = new IdGen("test");
        System.out.println(idGen);*/
        // Integer 集合，可以运行
       /* List<Integer> intList = Arrays.asList(0, 1, 2);
        print(intList);

        // String 集合，可以运行
        List<String> strList = Arrays.asList("0", "1", "2");
        print(strList);*/
        print1(1);
        print1("2");
    }
}
