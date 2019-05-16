package com.wei.learncode.optional;/*
package com.wei.learncode.optional;

import com.wei.learncode.stream.PersonModel;

import java.util.List;
import java.util.Optional;

*/

import com.wei.learncode.optional.EarthModel;
import com.wei.learncode.stream.PersonModel;

import java.util.List;
import java.util.Optional;

/**
 * @Author: weizz
 * @Date: 2019/4/16 16:07
 * @Description:
 * @Version:1.0
 */

public class Data {
    public static void main(String[] args) {

        PersonModel personModel = new PersonModel();

        //对象为空则打出 -
        Optional<Object> o = Optional.of(personModel);
        System.out.println(o.isPresent() ? o.get() : "-");

        //名称为空则打出 -
        Optional<String> name = Optional.ofNullable(personModel.getName());
        System.out.println(name.isPresent() ? name.get() : "-");

        //如果不为空，则打出xxx
        Optional.ofNullable("test").ifPresent(na -> {
            System.out.println(na + "ifPresent");
        });

        //如果空，则返回指定字符串
        System.out.println(Optional.ofNullable(null).orElse("-"));
        System.out.println(Optional.ofNullable("1").orElse("-"));

        //如果空，则返回 指定方法，或者代码
        System.out.println(Optional.ofNullable(null).orElseGet(() -> {
            return "hahah";
        }));
        System.out.println(Optional.ofNullable("1").orElseGet(() -> {
            return "hahah";
        }));
    }
}