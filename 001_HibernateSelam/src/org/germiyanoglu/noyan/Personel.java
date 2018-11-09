package org.germiyanoglu.noyan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PERSONEL",schema="SpringDatabase")
public class Personel {
	
	@Id
	@SequenceGenerator(name="personel_generator", sequenceName = "per_seq", allocationSize=50)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "personel_generator")  // mySQL -> IDENTITY
	@Column(name = "ID")
	private int id;
	
	@Column(name = "AD")
	private String ad;
	
	@Column(name = "SOYAD")
	private String soyad;
	
	@Column(name = "EMAIL")
	private String email;
	
	public Personel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personel(int id, String ad, String soyad, String email) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
