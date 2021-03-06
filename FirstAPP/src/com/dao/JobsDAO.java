package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.Jobs;
import com.model.SessionProvider;

public class JobsDAO {

	 public static boolean insertJob(Jobs j){
		 try{
			 SessionFactory s=SessionProvider.getSessionFactory();
			 Session s1=s.openSession();
			 Transaction t=s1.beginTransaction();
			 s1.save(j);
			 t.commit();
			 return true;
			 
		 }
		 catch(Exception e){
			 return false;
		 }
	 }
	 
	 
	 public static List<Jobs> getJobs(){
		 return SessionProvider.getSessionFactory().openSession().createCriteria(Jobs.class).list();
	 }
}
