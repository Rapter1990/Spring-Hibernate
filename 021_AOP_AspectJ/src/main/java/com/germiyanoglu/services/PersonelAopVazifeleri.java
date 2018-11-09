package com.germiyanoglu.services;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PersonelAopVazifeleri {
	/*
	@Before(value="execution(* com.germiyanoglu.model.Personel.*(..)))") //  *.*(..)) ku kısım gerekli  --> .*(..)) tüm sınıfları görme
	public void ilkGorev(JoinPoint joinPoint) {
		System.out.println("\n+++++METOTTAN ONCE+++++");
		System.out.println("----- ASPECTJ @Before Method Adı: " + joinPoint.getSignature().getName()); // methodun adını return etme
	}
    
	@AfterReturning(pointcut="execution(* com.germiyanoglu.model.Personel.selamlamaYap2(..))", returning="sonuc")
	public void sonraCalis(JoinPoint joinPoint, Object sonuc)  {
		System.out.println("====METOT GERI DONUS DEGERI SONRASI=====");
		System.out.println("----ASPECTJ @AfterReturning METOD ADI: " + joinPoint.getSignature().getName()  + " GERI DONUS DEGERI: "+ sonuc );
	}

	@AfterThrowing (pointcut =  "execution(* com.germiyanoglu.model.Personel.adiSoyadiKontrolEt(..)) ")
	public void istisnaSonrasi(JoinPoint joinPoint)  {
		System.out.println("====METOT ISTISNA SONRASI=====");
		System.out.println("----ASPECTJ @AfterThrowing METOD ADI: " + joinPoint.getSignature().getName() );
	}
	
	@After (value =  "execution(* com.germiyanoglu.model.Personel.*(..)) ")
	public void sonraCalis(JoinPoint joinPoint)  {
		System.out.println("====METOT SONRASI=====");
		System.out.println("----ASPECTJ @After METOD ADI: " + joinPoint.getSignature().getName()   );
	}
	*/
	
	@Around(value = "execution(* com.germiyanoglu.model.Personel.*(..)) ")
	public void kusatmaMetodu(ProceedingJoinPoint joinPoint) throws Throwable  {
		System.out.println("\n+++++METOTTAN ONCE+++++");
		System.out.println("----METOD ADI: " + joinPoint.getSignature().getName());
		joinPoint.proceed();
		System.out.println("====METOT SONRASI=====");
			
	}
	
	
	
}
