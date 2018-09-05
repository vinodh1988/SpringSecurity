package com.runner;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.SessionProvider;
import com.relations.model.Dept;
import com.relations.model.Employee;

public class Runner2 {
  public static void main(String[] args) {
	
	  SessionFactory sf=SessionProvider.getSessionFactory();
	  Session s1=sf.openSession();
	//  Transaction t=s1.beginTransaction();
	 /* Dept d=new Dept(1,"Marketing");
	  Employee e1=new Employee(1,"Vijay","Chennai","Manager");
	  Employee e2=new Employee(2,"Rajan","Nagpur","Clerk");
	  e1.setDept(d);
	  e2.setDept(d);
	  
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
		  //for(Employee e:d.getEmployees())
			  //System.out.println(e.getName()+" "+e.getCity()+" "+e.getDesig());
	  }
	  
	  
  }
}
