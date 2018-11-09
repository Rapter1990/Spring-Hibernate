package com.germiyanoglu.services;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MetotSonrasiVazifelerAfterReturning {

	@AfterReturning(pointcut="execution(* com.germiyanoglu.model.Personel.selamlamaYap2(..))", returning="sonuc")
	public void sonraCalis(JoinPoint joinPoint, Object sonuc)  {
		System.out.println("====METOT SONRASI=====");
		System.out.println("----- ASPECTJ Method Adı: " + joinPoint.getSignature().getName() + " Geri Dönüş : " + sonuc); // methodun adını return etme
	}

	
	

}
