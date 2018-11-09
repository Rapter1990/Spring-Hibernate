package com.germiyanoglu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Management {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"springcfg.xml"});
		
		// Yazar yazar = (Yazar) context.getBean("yazarBean");
		Yazar yazar = (Yazar) applicationContext.getBean("yazarBean",Yazar.class);
		
		System.out.println("YAZAR AD : " + yazar.getYazarAd());
		System.out.println("YAZAR SOYAD : " + yazar.getYazarSoyad());
		System.out.println("KİTAP AD : " + yazar.getKitapAdi());
		System.out.println("KİTAP ISN : " + yazar.getKitap().getEserIBN());
		
		// Bellekte tutulan alanı serbest bırak
		((ConfigurableApplicationContext) applicationContext).close();
		
	}
}
