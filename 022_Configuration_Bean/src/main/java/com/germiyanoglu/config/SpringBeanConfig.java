package com.germiyanoglu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.germiyanoglu.model.Ogrenci;
import com.germiyanoglu.model.Sehir;

@Configuration
public class SpringBeanConfig {

	
	/*<bean id="sehirBean" class="com.germiyanoglu.model.Sehir">
		<property name="sehirAd" value="Ankara"></property>
		<property name="plakaNo" value="06"></property>
	</bean>*/
	
	@Bean
	public Sehir getSehir() {
		Sehir sehir = new Sehir();
		sehir.setSehirAd("Adana");
		sehir.setPlakaNo(06);
		return sehir;
	}
	
	/*<bean id="ogrenciBean" class="com.germiyanoglu.model.Ogrenci">
		<property name="ad" value="Sercan Noyan"></property>
		<property name="soyad" value="Germiyanoğlu"></property>
		<property name="sehir" ref="sehirBean"></property>
	</bean>*/
	
	@Bean
	public Ogrenci getOgrenci() {
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setAd("Noyan");
		ogrenci.setSoyad("Germiyanoğlu");
		ogrenci.setSehir(getSehir());
		return ogrenci;
	}
	
	
	
	
}
