package com.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ioc.system2.Institute;
import com.ioc.system2.JavaConfig;

public class Runner2 {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(JavaConfig.class);	
		
		Institute i=(Institute)ac.getBean("blue");
		i.build();
		
		System.out.println("-------------------------------------------------");
		i=(Institute)ac.getBean("red");
		i.build();
	}
}
