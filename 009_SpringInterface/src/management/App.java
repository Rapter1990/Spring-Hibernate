package management;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.germiyanoglu.Araba;

public class App {
	
	public static void main(String[] args) {
		
		//Araba araba = new Araba();
			
		//BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("springcfg.xml"));
		
		/*ClassPathResource pathResource = new ClassPathResource("springcfg.xml");
		BeanFactory beanFactory = new XmlBeanFactory(pathResource);
		Araba araba = (Araba) beanFactory.getBean("araba");
		*/
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"springcfg.xml"});
		BeanFactory beanFactory = applicationContext;
		Araba araba = (Araba) beanFactory.getBean("araba");
		araba.bilgiGoster();
		
		
	}
}
