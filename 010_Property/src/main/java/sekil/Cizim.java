package sekil;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cizim {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"springcfg.xml"});
		//BeanFactory beanFactory = applicationContext;
		
		Ucgen ucgen = (Ucgen) applicationContext.getBean("ucgen");
		ucgen.ciz();
		
		
	}
}
