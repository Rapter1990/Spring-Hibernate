package org.germiyanoglu.noyan;

import java.util.logging.Logger;

import org.hibernate.Session;

import util.HibernateUtil;

public class Management {
	
	private static Session session;
	public final static Logger logger = Logger.getLogger(Management.class.getName());

	
	public static void main(String[] args) {
		
		Personel personel = new Personel();
		personel.setAd("Tuðba");
		personel.setSoyad("Türk");
		personel.setEmail("b@b.com");
		
		try {
			session = HibernateUtil.openSessionFactory();
			session.beginTransaction();
			
			session.save(personel);
			
			session.getTransaction().commit();
			logger.info("\n.................Database eklendi!..................\n");

		}catch(Exception sqlException) {
			if(session.getTransaction() != null ) {
				logger.info("\n.......Transaction Is Being Rolled Back.......\n");
				session.getTransaction().rollback();
				sqlException.printStackTrace();
			}			        
		}finally {
			// TODO: handle finally clause
			if(session != null) {
				logger.info("\n...............Session Kapandý...............\n");
				session.close();
			}
		}
		
		
		
	}

}
