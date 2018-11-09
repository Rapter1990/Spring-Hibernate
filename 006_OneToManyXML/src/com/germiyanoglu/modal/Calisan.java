package com.germiyanoglu.modal;

import java.io.Serializable;

public class Calisan implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String ad;
	private String soyad;
	private Departman departman;
	
	public Calisan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Calisan(String ad, String soyad, Departman departman) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.departman = departman;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Departman getDepartman() {
		return departman;
	}

	public void setDepartman(Departman departman) {
		this.departman = departman;
	}

	
}
