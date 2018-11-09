package selam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Management {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"springcfg.xml"});
		
		Selam selamSingleton1 = (Selam) applicationContext.getBean("selamSingleton");
		selamSingleton1.setMesaj("Mesaj");
		selamSingleton1.sonuc();
		System.out.println("selamSingleton1 : " + selamSingleton1);
		
		Selam selamSingleton2 = (Selam) applicationContext.getBean("selamSingleton");
		//selam2.getMesaj(); 
		selamSingleton2.sonuc();
		System.out.println("selamSingleton2 : " + selamSingleton2);
		System.out.println("----------------------------------------------");
		
		Selam selamPrototype1 = (Selam) applicationContext.getBean("selamPrototype");
		selamPrototype1.setMesaj("Mesaj");
		selamPrototype1.sonuc();
		System.out.println("selamPrototype1 : " + selamPrototype1);
		Selam selamPrototype2 = (Selam) applicationContext.getBean("selamPrototype");
		//selam2.getMesaj(); 
		selamPrototype2.sonuc();
		System.out.println("selamPrototype2 : " + selamPrototype2);
		
		
	}

}
