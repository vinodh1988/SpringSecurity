package com.runner;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.SessionProvider;
import com.relations.model.Contact;
import com.relations.model.Dept;
import com.relations.model.Employee;

public class Runner2 {
  public static void main(String[] args) {
	
	  SessionFactory sf=SessionProvider.getSessionFactory();
	  Session s1=sf.openSession();
	 /* Transaction t=s1.beginTransaction();
	  Dept d=new Dept(3,"Information Technology");
	  Employee e1=new Employee(5,"Janardhan","Chennai","Manager");
	  Employee e2=new Employee(6,"Suresh","Nagpur","Clerk");
	  Contact c1=new Contact(5,"janardhan@gmail.com","7937459734",e1);
	  Contact c2=new Contact(6,"suresh@gmail.com","8790834583",e2);
	  
	  e1.setDept(d);
	  e2.setDept(d);
	  e1.setContact(c1);
	  e2.setContact(c2);
	  
	  Set<Employee> s=new HashSet<Employee>();
	  s.add(e1);
	  s.add(e2);
	  
	  
	  d.setEmployees(s);
	  
	  s1.save(d);
	  t.commit();
	  System.out.println("Commit Succeeded");*/
	  
	  Query q=s1.createQuery("from Dept");
	  List<Dept> l=q.list();
	  
	  for(Dept d:l){
		  System.out.println(d.getName());
		  System.out.println("---------------------------------");
		  for(Employee e:d.getEmployees())
			  System.out.println(e.getName()+" "+e.getCity()+" "+e.getDesig()+" "+
					  (e.getContact()==null?null:e.getContact().getEmail()));
	  }
	  
	  
  }
}
