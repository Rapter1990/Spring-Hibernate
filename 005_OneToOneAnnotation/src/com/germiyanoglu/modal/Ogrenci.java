package com.germiyanoglu.modal;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="OGRENCI",schema="springDatabase")
public class Ogrenci implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="ogrenci_generator", sequenceName = "ogr_seq", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ogrenci_generator")  // mySQL -> IDENTITY
	@Column(name = "ID")
	private int id;
	
	@Column(name = "AD")
	private String ad;
	
	@Column(name = "SOYAD")
	private String soyad;
	
	@OneToOne(mappedBy = "ogrenci", cascade = CascadeType.ALL)
	private OgrenciBilgisi ogrenciBilgisi;
	
	public Ogrenci() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ogrenci(String ad, String soyad, OgrenciBilgisi ogrenciBilgisi) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.ogrenciBilgisi = ogrenciBilgisi;
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

	public OgrenciBilgisi getOgrenciBilgisi() {
		return ogrenciBilgisi;
	}

	public void setOgrenciBilgisi(OgrenciBilgisi ogrenciBilgisi) {
		this.ogrenciBilgisi = ogrenciBilgisi;
	}

	
}
