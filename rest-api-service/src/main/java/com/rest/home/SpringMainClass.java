package com.rest.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.rest.utilities.AwareUtility;

@ComponentScan(basePackages={"com.rest.control","com.rest.services","com.rest.utilities"})
@SpringBootApplication
@EntityScan(basePackages={"com.rest.entity"})
@EnableJpaRepositories(basePackages={"com.rest.dao"})
public class SpringMainClass {
	@Autowired
	AwareUtility util;
     public static void main(String n[]){
    	 SpringApplication.run(SpringMainClass.class,n);
     }
}
