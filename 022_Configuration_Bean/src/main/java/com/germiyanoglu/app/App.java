package com.germiyanoglu.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.germiyanoglu.config.SpringBeanConfig;
import com.germiyanoglu.model.Ogrenci;


public class App {

	public static void main(String[] args) {
		
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"springcfg.xml"});
		
		// 1 - Yol 
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		//context.register(SpringBeanConfig.class);
		
		// 2 - Yol 
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringBeanConfig.class);
		
		Ogrenci ogrenci = context.getBean(Ogrenci.class);
		
		System.out.println("Ogrenci Ad : " + ogrenci.getAd());
		System.out.println("Ogrenci Soyad : " + ogrenci.getSoyad());
		System.out.println("Sehir Ad: " + ogrenci.getSehir().getSehirAd());
		System.out.println("Sehir Plaka No: " + ogrenci.getSehir().getPlakaNo());
		
		context.close();
	}
}
