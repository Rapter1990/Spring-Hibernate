package org.germiyanoglu.modal;

import java.util.logging.Logger;

import org.hibernate.Session;

import util.HibernateUtil;

public class Management {
	
	private static Session session = null;
	public final static Logger logger = Logger.getLogger(Management.class.getName());

	
	public static void main(String[] args) {
		
		Personel personel = new Personel();
		personel.setAd("Asl�");
		personel.setSoyad("�afak");
		personel.setEmail("b@b.com");
		
		try {
			session = HibernateUtil.openSessionFactory();
			session.beginTransaction();
			
			session.save(personel);
			
			session.getTransaction().commit();
			logger.info("\n.................Database eklendi!..................\n");

		}catch(Exception sqlException) {
			if(session.getTransaction() != null ) { // .isActive() 
				logger.info("\n.......Transaction Is Being Rolled Back.......\n");
				session.getTransaction().rollback();
				sqlException.printStackTrace();
			}			        
		}finally {
			// TODO: handle finally clause
			if(session != null) {
				logger.info("\n...............Session Kapand�...............\n");
				session.close();
			}
		}
		
		
		
	}

}
