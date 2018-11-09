package com.germiyanoglu.modal;

import java.io.Serializable;

public class OgrenciBilgisi implements Serializable{

	private static final long serialVersionUID = 1L;

	private int ogrenciId;
	private String adres;
	private String email;
	
	private Ogrenci ogrenci;

	public OgrenciBilgisi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OgrenciBilgisi(String adres, String email, Ogrenci ogrenci) {
		super();
		this.adres = adres;
		this.email = email;
		this.ogrenci = ogrenci;
	}

	public int getOgrenciId() {
		return ogrenciId;
	}

	public void setOgrenciId(int ogrenciId) {
		this.ogrenciId = ogrenciId;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Ogrenci getOgrenci() {
		return ogrenci;
	}

	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}
	
}
