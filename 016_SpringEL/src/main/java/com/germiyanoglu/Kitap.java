package com.germiyanoglu;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//Sınıfları bean (springcfg.xml) tanımlamadan @Component yolunu kullanmak
@Component("kitapBean")
public class Kitap implements Serializable{
	
	//Değer vermek için @Value kullan
	@Value("Dağlar Dağlar")
	private String kitapAd;
	
	@Value("1234567890")
	private long eserIBN;

	public Kitap() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Kitap(String kitapAd, long eserIBN) {
		super();
		this.kitapAd = kitapAd;
		this.eserIBN = eserIBN;
	}

	public String getKitapAd() {
		return kitapAd;
	}

	public void setKitapAd(String kitapAd) {
		this.kitapAd = kitapAd;
	}

	public long getEserIBN() {
		return eserIBN;
	}

	public void setEserIBN(long eserIBN) {
		this.eserIBN = eserIBN;
	}
	
	
}
