package qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Ders {
	
	// 1.Yol - >@Autowired
	//@Autowired
	private Ogrenci ogrenci; // Başka bir sınıf içinde başka bir nesneyi kullanmak için Autowired
	
	
	private int puan;
	private String dersAd;
	
	public Ders() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// 3.Yol - >@Autowired
	// @Autowired
	public Ders(Ogrenci ogrenci) {
		super();
		this.ogrenci = ogrenci;
	}

	public Ders(Ogrenci ogrenci, int puan, String dersAd) {
		super();
		this.ogrenci = ogrenci;
		this.puan = puan;
		this.dersAd = dersAd;
	}

	public Ogrenci getOgrenci() {
		return ogrenci;
	}

	// 2.Yol - >@Autowired
	 @Autowired
	 @Qualifier("ogrenciBean3") // Hangi bean secilecekse ona göre işlem yapar. (örneğin : ogrenciBean1 )
	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}

	public int getPuan() {
		return puan;
	}

	public void setPuan(int puan) {
		this.puan = puan;
	}

	public String getDersAd() {
		return dersAd;
	}

	public void setDersAd(String dersAd) {
		this.dersAd = dersAd;
	}
	
}
