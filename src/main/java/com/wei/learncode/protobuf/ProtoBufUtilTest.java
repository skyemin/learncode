package com.wei.learncode.protobuf;

import java.util.Arrays;

/**
 * @Author: skye
 * @Date: 2019/11/22 11:02
 * @Description:
 * @Version:1.0
 */
public class ProtoBufUtilTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("lance");
        student.setAge(28);

        byte[] serializerResult = ProtoBufUtil.serializer(student);

        System.out.println("serializer result:" + Arrays.toString(serializerResult));

        Student deSerializerResult = ProtoBufUtil.deserializer(serializerResult,Student.class);

        System.out.println(deSerializerResult.getName());
        System.out.println(deSerializerResult.getAge());
    }
}
