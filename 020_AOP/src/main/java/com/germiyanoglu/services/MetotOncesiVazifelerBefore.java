package com.germiyanoglu.services;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MetotOncesiVazifelerBefore implements MethodBeforeAdvice {

	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("\n+++++METOTTAN ONCE+++++");
	}

	

}
