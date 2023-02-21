package com.wei.learncode.lambdaMetafactory;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String methodName="operate";
        String className="com.wei.learncode.lambdaMetafactory.Operation";
        try {
            Class clazz=Class.forName(className);
            Operation o = (Operation)clazz.newInstance();
            MethodHandles.Lookup lookup=MethodHandles.lookup();
            Method method= clazz.getDeclaredMethod(methodName,int.class,int.class,int.class);
            //指定方法不以反射运行
            MethodHandle mh=lookup.unreflect(method);
            //获取方法的类型
            MethodType type=mh.type();
            //将方法的实例对象类型加到方法类型工厂里
            MethodType factoryType= MethodType.methodType(OperatorFunction.class,type.parameterType(0));
            //移除方法里的实例对象类型
            type=type.dropParameterTypes(0,1);
            //获取代理对象，注意，第二个参数的字符串必须为函数式接口里的方法名
            OperatorFunction operator=(OperatorFunction) LambdaMetafactory.metafactory(lookup,"toOperate",factoryType,type,mh,type).getTarget().invokeExact(o);
            /*Operation o = (Operation)clazz.newInstance();
            Method method = Operation.class.getMethod("operate",int.class,int.class,int.class);*/
            for (int i = 0; i < 10000000; i++) {
                //通过全类名，获取类的实例
                //method.invoke(o,787874, 15131, 441212);
                //获取到类的对象，要求该类必须有无参构造
                int operate = operator.toOperate(787874, 15131, 441212);
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时:"+(end-start));
    }
}
