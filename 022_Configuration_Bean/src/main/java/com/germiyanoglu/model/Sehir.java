package com.germiyanoglu.model;

public class Sehir {

	private String sehirAd;
	private int plakaNo;
	
	public Sehir() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sehir(String sehirAd, int plakaNo) {
		super();
		this.sehirAd = sehirAd;
		this.plakaNo = plakaNo;
	}

	public String getSehirAd() {
		return sehirAd;
	}

	public void setSehirAd(String sehirAd) {
		this.sehirAd = sehirAd;
	}

	public int getPlakaNo() {
		return plakaNo;
	}

	public void setPlakaNo(int plakaNo) {
		this.plakaNo = plakaNo;
	}
	

}
