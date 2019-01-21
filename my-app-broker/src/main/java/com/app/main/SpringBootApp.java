package com.app.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.app.messaging.Sender;

@SpringBootApplication
@ComponentScan(basePackages={"com.app.messaging","com.app.controller"})
@EntityScan(basePackages="com.app.model")
@EnableJpaRepositories(basePackages="com.app.dao")
public class SpringBootApp {

	public static void main(String n[]){
		
		SpringApplication.run(SpringBootApp.class,n);
		//sender.send("First Message#################");
	}
}
