package com.shop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAop {
	/*
	 * @After("execution(* getCart*(*))") public void m2(JoinPoint jp) {
	 * System.out.println("---- 2");
	 * System.out.println("--- after get method got called from  " +
	 * jp.getSignature().getDeclaringTypeName() + "." +
	 * jp.getSignature().getName());
	 * System.out.println(jp.getStaticPart().getSignature());
	 * 
	 * }
	 * 
	 * @Before("execution(* getCart*(*))") public void m1(JoinPoint jp) {
	 * System.out.println("--- 1");
	 * System.out.println("--- get method got called from  " +
	 * jp.getSignature().getDeclaringTypeName() + "." +
	 * jp.getSignature().getName());
	 * System.out.println(jp.getStaticPart().getSignature());
	 * 
	 * }
	 */

	@Around("execution(* testMethod*(*))")
	public void m3(ProceedingJoinPoint jp) {

		System.out.println("---- Before BL");

		try {
			
			String val=(String) jp.proceed();
			System.out.println(val);
		
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("---- After BL");

	}

}
