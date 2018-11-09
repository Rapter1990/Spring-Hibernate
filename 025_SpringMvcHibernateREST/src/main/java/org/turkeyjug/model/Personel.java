package org.turkeyjug.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table (name="PERSONEL",schema="springDatabase")
@XmlRootElement(name = "personel")
@XmlAccessorType(XmlAccessType.FIELD) // Verilerin üzerinde annotation kullanımı
public class Personel {
	
	
	/*<personel>
		<id></id>
		<ad></ad>
		<soyad></soyad>
		<email></email>
	</personel>*/
	
	@Id
	@SequenceGenerator(name="personel_generator", sequenceName = "per_seq", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "personel_generator")  // mySQL -> IDENTITY
	@Column(name = "ID")
	@XmlElement(name = "id")
	private int id;
	
	@Column(name = "AD")
	@XmlElement(name = "ad")
	private String adi;
	
	@Column(name = "SOYAD")
	@XmlElement(name = "soyad")
	private String soyadi;
	
	@Column(name = "EMAIL")
	@XmlElement(name = "email")
	private String email;
	
	
	public Personel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Personel(String adi, String soyadi, String email) {
		super();
		this.adi = adi;
		this.soyadi = soyadi;
		this.email = email;
	}



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
