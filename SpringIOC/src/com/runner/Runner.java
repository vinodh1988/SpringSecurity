package com.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.system.Factory;

public class Runner {
  public static void main(String[] args) {
	
    ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
    Factory f=(Factory)ac.getBean("car");
    
    f.info();
    
    System.out.println("----------------------------------------------");
    f=(Factory)ac.getBean("mobile");
    f.info();
  }
}
