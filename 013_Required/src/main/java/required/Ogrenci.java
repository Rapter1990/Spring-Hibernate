package required;

import org.springframework.beans.factory.annotation.Required;

public class Ogrenci {
	
	private String ad;
	private String soyad;
	private Integer yas;
	
	public Ogrenci() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ogrenci(String ad, String soyad, Integer yas) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
	}
	
	public String getAd() {
		return ad;
	}
	
	
	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}
	
	
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public Integer getYas() {
		return yas;
	}

	// @Required Set methodun üzerlerine eklenir ve illa yas set etmesi için yas olmazsa hata fırlatır.
	public void setYas(Integer yas) {
		this.yas = yas;
	}

}
