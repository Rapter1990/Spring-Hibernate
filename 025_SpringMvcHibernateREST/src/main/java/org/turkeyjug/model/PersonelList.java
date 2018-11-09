package org.turkeyjug.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "personeller")
public class PersonelList {
	
	private List<Personel> personel = new ArrayList<Personel>();

	public List<Personel> getPersonel() {
		return personel;
	}

	public void setPersonel(List<Personel> personel) {
		this.personel = personel;
	}

	
	
}
