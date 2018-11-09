package org.turkeyjug.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.turkeyjug.model.Personel;

@Repository
public class PersonelDAOImpl implements PersonelDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public PersonelDAOImpl() {
	}

	public PersonelDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public Personel get(int id) {
		/*String hql = "from Personel where id =" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Personel> personelListe = (List<Personel>) query.list();
		
		if ((personelListe != null) && (!personelListe.isEmpty()) ) {
			return personelListe.get(0);
		}
		
		return null;*/
		
		
		// TODO Auto-generated method stub
		String hql = "from Personel where id =" + id;
		
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery(hql);
	    
		@SuppressWarnings("unchecked")
		List<Personel> personelList = query.list();
	    
	    if((personelList != null) && !(personelList.isEmpty())) {
	    	return personelList.get(0);
	    }
	    
	    session.close();
		return null;
	}

	@Override
	@Transactional
	public List<Personel> list() {
		/*@SuppressWarnings("unchecked")
		List<Personel> personelListe = (List<Personel>) sessionFactory.getCurrentSession()
				.createCriteria(Personel.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return personelListe;*/
		
		// TODO Auto-generated method stub
		String hql = "from Personel";
		
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery(hql);
	    
		@SuppressWarnings("unchecked")
		List<Personel> personelList = query.list();
	    
	    if((personelList != null) && !(personelList.isEmpty())) {
	    	return personelList;
	    }
	    
	    session.close();
		return null;
	}

	@Override
	@Transactional
	public void saveOrUpdate(Personel personel) {
		//sessionFactory.getCurrentSession().saveOrUpdate(personel);
		sessionFactory.openSession().saveOrUpdate(personel);
	}

	@Override
	@Transactional
	public void delete(int id) {
		/*Personel personel = new Personel();
		personel.setId(id);
		sessionFactory.getCurrentSession().delete(personel);*/
		
		// TODO Auto-generated method stub
		Personel personel = new Personel();
		personel.setId(id);
		sessionFactory.openSession().delete(personel);
		
	}

}
