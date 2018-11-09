package scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Management {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"springcfg.xml"});
		
		System.out.println("A Nesnesi : " + applicationContext.getBean("beanA").getClass());
		
		System.out.println("B Nesnesi : " + applicationContext.getBean("beanB").getClass());
		
		System.out.println("C Nesnesi : " + applicationContext.getBean("beanC").getClass());
		
	}

}
