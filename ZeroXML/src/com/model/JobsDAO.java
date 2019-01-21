package com.model;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class JobsDAO {
	@Autowired
	SessionFactory sessionFactory;

	public List<Jobs> getJobs(){
		return sessionFactory.getCurrentSession().createCriteria(Jobs.class).list();
	}
	
	public boolean addJob(Jobs j){
		try{
		sessionFactory.getCurrentSession().save(j);
		return true;
		}
		catch(Exception e){
		    System.out.println("Exception occured");
			return false;
		}
	}
}
