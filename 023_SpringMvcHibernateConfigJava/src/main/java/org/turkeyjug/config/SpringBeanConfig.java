package org.turkeyjug.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.turkeyjug.dao.PersonelDAO;
import org.turkeyjug.dao.PersonelDAOImpl;
import org.turkeyjug.model.Personel;

@Configuration
@EnableWebMvc
@ComponentScan("org.turkeyjug.*")
@EnableTransactionManagement
public class SpringBeanConfig {

	@Bean(name="viewResolver")
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver  viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
    @Bean(name = "dataSource")
    public DataSource getDataSource() {
    	BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("springDatabase");
		dataSource.setPassword("123");
		return dataSource;
    }  
    
    private Properties getHibernateProperties() {
    	Properties properties = new Properties();
		properties.put("show_sql", "true");
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		return properties;
  
    }
    
    @Autowired
    @Bean(name = "sessionFactory")
    public SessionFactory getSessionFactory(DataSource dataSource) {
    	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
    	sessionBuilder.addProperties(getHibernateProperties());
    	sessionBuilder.addAnnotatedClasses(Personel.class);
    	return sessionBuilder.buildSessionFactory();
    }
    
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}
			
	@Autowired
	@Bean(name="personelDAO")
	public PersonelDAO getPersonelDAO(SessionFactory sessionFactory) {
		return new PersonelDAOImpl(sessionFactory) ;
	}	
	
	// UTF - 8 ( Karakter sorunu çözme )
	/*@Bean
	public MessageSource messageSource() {
	    ResourceBundleMessageSource source = new ResourceBundleMessageSource();
	    source.setBasename("i18n/messages");
	    source.setDefaultEncoding("UTF-8");
	    return source;
	}*/
}
