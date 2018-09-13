package com.runner;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.inheritance.model.RegularEmployee;
import com.model.SessionProvider;

public class Runner6 {
	public static void main(String n[]){
		  SessionFactory sf=SessionProvider.getSessionFactory();
		  Session s1=sf.openSession();
		  Transaction t=s1.beginTransaction();
		 /* Employee e=new Employee();
		  e.setEid(11);
		  e.setName("Jagan");*/
		  
		/* RegularEmployee r=new RegularEmployee();
		  r.setEid(12);
		  r.setName("Jagan");
		  r.setDesig("Programmer");
		  s1.save(r);
		  t.commit();*/
		  
		  Criteria c=s1.createCriteria(RegularEmployee.class);
		  Criterion c1=Restrictions.ilike("name", "P%");
		  Criterion c2=Restrictions.gt("eid", 12);
		  c.add(c1);
		  c.add(c2);
		 // Query c=s1.createQuery("from RegularEmployee where name like 'P%'");
		  List<RegularEmployee> l=c.list();
		  
		  for(RegularEmployee x:l)
			  System.out.println(x.getName()+ "  "+x.getDesig());
		  
		  
		  
		  
		  
		  
	  }
}
