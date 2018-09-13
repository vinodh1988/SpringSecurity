package com.runner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.inheritance.model.TestPlayer;
import com.model.SessionProvider;

public class Runner5 {
  public static void main(String n[]){
	  SessionFactory sf=SessionProvider.getSessionFactory();
	  Session s1=sf.openSession();
	  Transaction t=s1.beginTransaction();
	  
	  TestPlayer o=new TestPlayer();
	  o.setShirtno(15);
	  o.setName("Steve Waugh");
	  o.setTruns(10434);
	  o.setTfours(23);
	  o.setTsixes(14);
	  
	  s1.save(o);
	  t.commit();
	  
  }
}
