package org.turkeyjug.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.turkeyjug.dao.PersonelDAO;
import org.turkeyjug.model.Personel;
import org.turkeyjug.model.PersonelList;


@RestController
public class PersonelRESTController {
	
	@Autowired
	private PersonelDAO personelDAO; 
	
	//	http://localhost:8091/{adi}/{soyad}/{email}.xml
	@RequestMapping(value = "/{adi}/{soyad}/{email}.xml", method = RequestMethod.GET,
			produces = "application/xml; charset=UTF-8")
	public Personel uretxml(
			@PathVariable("adi") String ad,
			@PathVariable("soyad") String soyad,
			@PathVariable("email") String email) throws Exception {
		
		Personel personel = new Personel(ad,soyad,email);
		return personel;
		
	}
	

	//	http://localhost:8091/{adi}/{soyad}/{email}.json
	@RequestMapping(value = "/{adi}/{soyad}/{email}.json", method = RequestMethod.GET,
			produces = "application/json; charset=UTF-8")
	public Personel uretjson(
			@PathVariable("adi") String ad,
			@PathVariable("soyad") String soyad,
			@PathVariable("email") String email) throws Exception  {
		
		
		Personel personel = new Personel(ad,soyad,email);
		return personel;
		
		
	}	
	
	// XML DE  birden fazla istek olduğunda 406 hatası veriyor. Bunun için modal de personelList class oluşturduk
	
	//	http://localhost:8091/xml/personel
	@RequestMapping(value = "/xml/personel", method = RequestMethod.GET,
			produces = "application/xml; charset=UTF-8")
	public PersonelList uretxml2() throws Exception  {
		
		List<Personel> personelList = personelDAO.list();
		PersonelList list = new PersonelList();
		list.getPersonel().addAll(personelList);
		return list;
		
	}	
	
	//	http://localhost:8091/json/personel
	@RequestMapping(value = "/json/personel", method = RequestMethod.GET,
			produces = "application/json; charset=UTF-8")
	public List<Personel> uretjson2() throws Exception  {
		
		List<Personel> personelList = personelDAO.list();
		
		return personelList;
		
	}	
	
	
	//	http://localhost:8091/xml/personel/4
	@RequestMapping(value = "/xml/personel/{id}", method = RequestMethod.GET,
			produces = "application/xml; charset=UTF-8")
	public Personel uretxml3(@PathVariable("id") int id) throws Exception  {
		
		Personel personel = personelDAO.get(id);
		return personel;
		
	}	
	
	//	http://localhost:8091/json/personel/4
	@RequestMapping(value = "/json/personel/{id}", method = RequestMethod.GET,
			produces = "application/json; charset=UTF-8")
	public Personel uretjson3(@PathVariable("id") int id) throws Exception  {
		
		Personel personel = personelDAO.get(id);
		return personel;
		
	}	

}









