package com.germiyanoglu.model;

public class Ogrenci {

	private String ad;
	private String soyad;
	private Sehir sehir;
	
	public Ogrenci() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ogrenci(String ad, String soyad, Sehir sehir) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.sehir = sehir;
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

	public Sehir getSehir() {
		return sehir;
	}

	public void setSehir(Sehir sehir) {
		this.sehir = sehir;
	}
	
}
