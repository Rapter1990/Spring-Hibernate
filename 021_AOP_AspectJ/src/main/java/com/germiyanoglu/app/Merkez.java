package com.germiyanoglu.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.germiyanoglu.model.Personel;

public class Merkez {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"springcfg.xml"});
		
		// ApplicationContext context = new ClassPathXmlApplicationContext("springcfg.xml");
		
		//Personel personel = applicationContext.getBean("personelBean",Personel.class);
		
		Personel personel = applicationContext.getBean("personelBean", Personel.class);
		
		
		try {
			personel.adiSoyadiKontrolEt();
			personel.bilgiAl();
			personel.selamlamaYap();			
		} catch (Exception e) {
			System.out.println("HATA MEYDANA GELDI : "+ e);
		}
		
		
		
		((ConfigurableApplicationContext) applicationContext).close();
	}
	
}
