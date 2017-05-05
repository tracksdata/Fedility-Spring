package com.shop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAop {
	@Before("execution(* getCart*(*))")
	public void m1(JoinPoint jp){
		System.out.println("--- get method got called from  "+jp.getSignature().getDeclaringTypeName()+"."+jp.getSignature().getName());
		System.out.println(jp.getStaticPart().getSignature());
	}
	
}
