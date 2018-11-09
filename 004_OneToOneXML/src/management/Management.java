package management;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.germiyanoglu.modal.Ogrenci;
import com.germiyanoglu.modal.OgrenciBilgisi;

import util.HibernateUtil;


public class Management {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.openSessionFactory();
		Transaction transaction = null;
		Ogrenci ogrenci = null;
		OgrenciBilgisi ogrenciBilgisi = null;
		
		try {
			transaction = session.beginTransaction();
			
			ogrenciBilgisi = new OgrenciBilgisi();
			ogrenciBilgisi.setAdres("Ankara");
			ogrenciBilgisi.setEmail("a@a.com");
			
			ogrenci = new Ogrenci();
			ogrenci.setAd("Noyan");
			ogrenci.setSoyad("Germiyanoðlu");
			
			ogrenci.setOgrenciBilgisi(ogrenciBilgisi);
			ogrenciBilgisi.setOgrenci(ogrenci);
			
			session.save(ogrenci); // cascade bir tek ogrenci.hbm.xml (Kaydetme iþlemi) olduðundan buraya ogrenci yazcaðýz.
			
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
