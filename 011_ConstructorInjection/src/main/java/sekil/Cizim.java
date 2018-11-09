package sekil;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cizim {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"springcfg.xml"});
		//BeanFactory beanFactory = applicationContext;
		
		Ucgen ucgensetter = (Ucgen) applicationContext.getBean("ucgenSetter");
		ucgensetter.ciz();
		System.out.println("-------------------------------------------------------------------");
		
		Ucgen ucgenConstructor1 = (Ucgen) applicationContext.getBean("ucgenConstructor1");
		ucgenConstructor1.ciz();
		System.out.println("-------------------------------------------------------------------");
		
		Ucgen ucgenConstructor2 = (Ucgen) applicationContext.getBean("ucgenConstructor2");
		ucgenConstructor2.ciz();
		System.out.println("-------------------------------------------------------------------");
		
		
	}
}
