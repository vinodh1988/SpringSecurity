package com.runner;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.SessionProvider;
import com.relations.model.Course;
import com.relations.model.Trainer;

public class Runner3 {
  public static void main(String n[]){
	  SessionFactory sf=SessionProvider.getSessionFactory();
	  Session s1=sf.openSession();
	 /* Transaction t=s1.beginTransaction();
	  
	  Trainer t1=new Trainer(1,"Bennet");
	  Trainer t2=new Trainer(2,"Kishore");
	  
	  Set<Course> tset1=new HashSet<Course>();
	  
	  Set<Course> tset2=new HashSet<Course>();
	  //Set<Course>  tset=new HashSet<Course>();
	  Set<Trainer> cset1=new HashSet<Trainer>();
	  Set<Trainer> cset2=new HashSet<Trainer>();
	  Set<Trainer> cset3=new HashSet<Trainer>();
	  
	  cset1.add(t1);
	  cset1.add(t2);
	  cset2.add(t1);
	  cset3.add(t2);
	  
	  
	  Course c1=new Course(1,"Java");
	  Course c2=new Course(2,"SQL");
	  Course c3=new Course(3,"JS");
	  
	  c1.setTrainers(cset1);
	  c2.setTrainers(cset2);
	  c3.setTrainers(cset3);
	  
	  tset1.add(c1);
	  tset1.add(c2);
	  
	  tset2.add(c1);
	  tset2.add(c3);
	  
	  t1.setCourses(tset1);
	  t2.setCourses(tset2);
	  
	  s1.save(t1);
	  s1.save(t2);
	  
	  
	  t.commit();
	  System.out.println("commit");
	  
	  */
	  
	  List<Course> q=s1.createQuery("from Course").list();
	  
	  for(Course c:q)
	  {
		  System.out.println("Coursename::"+c.getName());
		  System.out.print("--------------------------------------");
		  for(Trainer t:c.getTrainers())
			  System.out.println(t.getName());
		  System.out.println("====================================");;
	  }
	  
  }
}
