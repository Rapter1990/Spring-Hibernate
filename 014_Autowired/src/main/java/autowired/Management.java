package autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Management {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"springcfg.xml"});
		
		Ders ders1 = (Ders) applicationContext.getBean("dersBean2");
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Ad : " + ders1.getOgrenci().getAd());
		System.out.println("Soyad : " + ders1.getOgrenci().getSoyad());
		System.out.println("Yas : " + ders1.getOgrenci().getYas());
		
		System.out.println("Ders Ad : " + ders1.getDersAd());
		System.out.println("Puan : " + ders1.getPuan());
		
		System.out.println("--------------------------------------------------------");
		
		
		// Bellekte tutulan alanı serbest bırak
		((ConfigurableApplicationContext) applicationContext).close();
	}
}
