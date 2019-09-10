package com.wei.learncode.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

//声明这是一个切面类
@Aspect
//让此切面称为spring管理的一个Bean
@Component
public class LogAspect {

	@Pointcut("@annotation(com.wei.aop.Acction)")
	public void annotationPointCut(){
		
	}
	//扫描拥有这个注解的
	@After("annotationPointCut()")
	public void after(JoinPoint joinPoint){
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		Acction acction = method.getAnnotation(Acction.class);
		System.out.println(acction.name());
	}
	//扫描满足条件的切入点表达式
	@Before("execution (* com.wei.aop.DemoMethodService.*(..))")
	public void before(JoinPoint joinPoint){
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println(method.getName());
	}
   @Around("execution (* com.wei.aop.DemoMethodService.around(..))")
    public void around(ProceedingJoinPoint pjp) throws Throwable{
	    System.out.println("已经记录下操作日志@Around 方法执行前");
        pjp.proceed();
        System.out.println("已经记录下操作日志@Around 方法执行后");
    }
}
