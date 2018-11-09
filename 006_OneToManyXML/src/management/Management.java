package management;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.germiyanoglu.modal.Calisan;
import com.germiyanoglu.modal.Departman;

import util.HibernateUtil;


public class Management {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.openSessionFactory();
		Transaction transaction = null;
		Calisan calisan1 = null;
		Calisan calisan2 = null;
		Calisan calisan3 = null;
		Departman departman = null;
		
		try {
			transaction = session.beginTransaction();
			
			departman = new Departman();
			departman.setAd("Yazýlým");
			session.save(departman);
			
			calisan1 = new Calisan();
			calisan1.setAd("Noyan");
			calisan1.setSoyad("Germiyanoglu");
			calisan1.setDepartman(departman);
			
			calisan2 = new Calisan();
			calisan2.setAd("Sercan");
			calisan2.setSoyad("Tokak");
			calisan2.setDepartman(departman);
			
			calisan3 = new Calisan();
			calisan3.setAd("Irmak");
			calisan3.setSoyad("Deli");
			calisan3.setDepartman(departman);
			
			
			session.save(calisan1);
			session.save(calisan2);
			session.save(calisan3);
			
			System.out.println("Kaydetme iþlemi tamamlandý.");
			
			transaction.commit();
			
		} catch(Exception e) {
			if(transaction != null ) { // .isActive() 
				transaction.rollback();
				e.printStackTrace();
			}		
		}finally {
			// TODO: handle finally clause
			if(session != null) {
				System.out.println("Session Kapandý.");
				session.close();
			}
		}
		
	}

}
