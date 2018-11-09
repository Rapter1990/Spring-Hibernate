package management;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.germiyanoglu.Araba;

public class App {
	public static void main(String[] args) {
		
		//Araba araba = new Araba();
		
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("springcfg.xml"));
		Araba araba = (Araba) beanFactory.getBean("araba");
		araba.bilgiGoster();
		
		
	}
}
