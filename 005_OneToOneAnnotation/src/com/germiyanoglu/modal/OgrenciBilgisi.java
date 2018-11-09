package com.germiyanoglu.modal;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


@Entity
@Table(name="OGRENCIBILGISI",schema="springDatabase")
public class OgrenciBilgisi implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GenericGenerator(name = "generator", strategy = "foreign", 
	parameters = @Parameter(name = "property", value = "ogrenci"))
	@GeneratedValue(generator = "generator")
	@Column(name = "OGRENCI_ID")
	private int ogrenciId;
	
	@Column(name = "ADRES")
	private String adres;
	
	@Column(name = "EMAIL")
	private String email;
	
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
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
