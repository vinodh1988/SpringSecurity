package com.runner;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.inheritance.model.Student;
import com.model.SessionProvider;

public class Runner4 {
  public static void main(String n[]){
	  SessionFactory s=SessionProvider.getSessionFactory();
		Session s1=s.openSession();
		
		/*Transaction t=s1.beginTransaction();
		
		PGStudent ug=new PGStudent(3,"Naresh",84.22,"MBA");
		s1.save(ug);
		t.commit();
		System.out.println("row inserted");*/
		
		Query q=s1.createQuery("from Student");
		List<Student> l=q.list();
		for(Student x:l)
			System.out.println(x.getName()+" "+x.getSno());
		
  }
}
