package com.germiyanoglu.services;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MetotSonrasiVazifelerAfterReturning implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method metotAdi, Object[] args, Object hedef) throws Throwable {
		System.out.println("====METOT SONRASI=====");
	}

	
	

}
