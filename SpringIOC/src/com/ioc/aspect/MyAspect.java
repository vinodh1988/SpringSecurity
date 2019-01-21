package com.ioc.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class MyAspect {
	
	@Pointcut("execution(* com.ioc.system.CircuitDesign.designProduct(..))")
	public void dummy(){
		
	}
   
	@Before("dummy()")
	public void execute(){
		System.out.println("Purchasing circuit design tools..!!");
		
	}
	
	@After("dummy()")
	public void exe(){
		System.out.println("Documenting the circuit design...!!!");
		
	}

}
