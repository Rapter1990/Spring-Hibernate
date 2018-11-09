package org.turkeyjug.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name="PERSONEL",schema="springDatabase")
public class Personel {
	
	@Id
	@SequenceGenerator(name="personel_generator", sequenceName = "per_seq", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "personel_generator")  // mySQL -> IDENTITY
	@Column(name = "ID")
	private int id;
	
	@Column(name = "AD")
	private String adi;
	
	@Column(name = "SOYAD")
	private String soyadi;
	
	@Column(name = "EMAIL")
	private String email;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	
	
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
