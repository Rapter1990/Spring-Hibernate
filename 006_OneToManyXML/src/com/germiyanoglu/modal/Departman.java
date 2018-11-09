package com.germiyanoglu.modal;

import java.io.Serializable;
import java.util.Set;

public class Departman implements Serializable{

	private static final long serialVersionUID = 1L;

	private int departmanId;
	private String Ad;
	
	private Set<Calisan> calisanlar; // Sayýyý bilmediðimiz için Set kullandýk
	
	public Departman() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Departman(String ad, Set<Calisan> calisanlar) {
		super();
		Ad = ad;
		this.calisanlar = calisanlar;
	}

	public int getDepartmanId() {
		return departmanId;
	}


	public void setDepartmanId(int departmanId) {
		this.departmanId = departmanId;
	}


	public String getAd() {
		return Ad;
	}

	public void setAd(String ad) {
		Ad = ad;
	}


	public Set<Calisan> getCalisanlar() {
		return calisanlar;
	}


	public void setCalisanlar(Set<Calisan> calisanlar) {
		this.calisanlar = calisanlar;
	}

}
