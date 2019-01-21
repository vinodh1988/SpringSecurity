package com.model;


import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;



public class SessionProvider {
	
	public static SessionFactory getSessionFactory(){
		ServiceRegistry serviceRegistry;
		SessionFactory sessionFactory;
		try{
		StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
			    .configure( "hibernate.cfg.xml" )
			    .build();

		Metadata metadata = new MetadataSources( standardRegistry )
			    .getMetadataBuilder()
			    .build();

		sessionFactory = metadata.getSessionFactoryBuilder()
			   
			    .build();
		return sessionFactory;
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
