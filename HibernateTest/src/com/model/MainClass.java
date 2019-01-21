package com.model;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf=SessionProvider.getSessionFactory();
		Session s=sf.openSession();
		System.out.println("This is working...!!!!");
		Transaction t=s.beginTransaction();
		Employee e=new Employee();
		e.setSno(12);
		e.setName("Rajeev");
		s.save(e);
		t.commit();
	}

}
