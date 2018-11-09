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
			ogrenci.setSoyad("Germiyano�lu");
			
			ogrenci.setOgrenciBilgisi(ogrenciBilgisi);
			ogrenciBilgisi.setOgrenci(ogrenci);
			
			session.save(ogrenci); // cascade bir tek ogrenci.hbm.xml (Kaydetme i�lemi) oldu�undan buraya ogrenci yazca��z.
			
			System.out.println("Kaydetme i�lemi tamamland�.");
			
			transaction.commit();
			
		} catch(Exception e) {
			if(transaction != null ) { // .isActive() 
				transaction.rollback();
				e.printStackTrace();
			}		
		}finally {
			// TODO: handle finally clause
			if(session != null) {
				System.out.println("Session Kapand�.");
				session.close();
			}
		}
		
	}

}
