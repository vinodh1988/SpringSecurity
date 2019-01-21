package com.ioc.system2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.ioc.system2"})
public class JavaConfig {

	@Bean(name="blue")
	public Institute  getBean(){
		  return new Blue();
	  }
	
	@Bean(name="red")
	public Institute getRed(){
		return new Red();
	}
}
