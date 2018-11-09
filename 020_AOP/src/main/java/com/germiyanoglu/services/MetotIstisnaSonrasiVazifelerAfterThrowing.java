package com.germiyanoglu.services;

import org.springframework.aop.ThrowsAdvice;

public class MetotIstisnaSonrasiVazifelerAfterThrowing implements ThrowsAdvice {

	
public void afterThrowing(IllegalArgumentException ex) throws Throwable{
	System.out.println("????? METOTTAKI ISTISNADAN SONRA ?????");
}
	

}
