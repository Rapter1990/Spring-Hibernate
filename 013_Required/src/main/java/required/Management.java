package required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Management {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"springcfg.xml"});
		
		Ogrenci ogrenci1 = (Ogrenci) applicationContext.getBean("ogrenciBean");
		
		System.out.println("Ad : " + ogrenci1.getAd() 
						   +"\nSoyad : " + ogrenci1.getSoyad() 
		                   + "\nYas : " + ogrenci1.getYas());
		
		System.out.println("--------------------------------------------------------");
		
		Ogrenci ogrenci2 = (Ogrenci) applicationContext.getBean("ogrenciBean1");
		
		System.out.println("Ad : " + ogrenci2.getAd() 
						   +"\nSoyad : " + ogrenci2.getSoyad() 
		                   + "\nYas : " + ogrenci2.getYas());
		
		// Bellekte tutulan alanı serbest bırak
		((ConfigurableApplicationContext) applicationContext).close();
	}
}
