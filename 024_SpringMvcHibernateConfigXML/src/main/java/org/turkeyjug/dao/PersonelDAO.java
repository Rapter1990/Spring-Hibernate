package org.turkeyjug.dao;

import java.util.List;

import org.turkeyjug.model.Personel;

public interface PersonelDAO {
	
	public Personel get(int id);
	
	public List<Personel> list();

	public void saveOrUpdate (Personel personel); 
	
	public void delete (int id); 
	
}
