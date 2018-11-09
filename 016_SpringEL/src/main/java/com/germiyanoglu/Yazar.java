package com.germiyanoglu;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Sınıfları bean (springcfg.xml) tanımlamadan @Component yolunu kullanmak
@Component("yazarBean")
public class Yazar implements Serializable{
	
	//Değer vermek için @Value kullan
	@Value("Elxan")
	private String yazarAd;
	
	@Value("Danil")
	private String yazarSoyad;
	
	@Value("#{kitapBean}")
	private Kitap kitap;
	
	@Value("#{kitapBean.kitapAd}")
	private String kitapAdi;

	public Yazar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Yazar(String yazarAd, String yazarSoyad, Kitap kitap, String kitapAdi) {
		super();
		this.yazarAd = yazarAd;
		this.yazarSoyad = yazarSoyad;
		this.kitap = kitap;
		this.kitapAdi = kitapAdi;
	}

	public String getYazarAd() {
		return yazarAd;
	}

	public void setYazarAd(String yazarAd) {
		this.yazarAd = yazarAd;
	}

	public String getYazarSoyad() {
		return yazarSoyad;
	}

	public void setYazarSoyad(String yazarSoyad) {
		this.yazarSoyad = yazarSoyad;
	}

	public Kitap getKitap() {
		return kitap;
	}

	public void setKitap(Kitap kitap) {
		this.kitap = kitap;
	}

	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	
	
	
}
