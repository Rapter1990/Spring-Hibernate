package com.germiyanoglu.services;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MetotOncesiVazifelerBefore {

	@Before(value="execution(* com.germiyanoglu.model.Personel.*(..)))") //  *.*(..)) ku kısım gerekli  --> .*(..)) tüm sınıfları görme
	public void ilkGorev(JoinPoint joinPoint) {
		System.out.println("\n+++++METOTTAN ONCE+++++");
		System.out.println("----- ASPECTJ Method Adı: " + joinPoint.getSignature().getName()); // methodun adını return etme
	}

	

}
