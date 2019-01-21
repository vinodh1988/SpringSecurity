package com.services;

import org.springframework.stereotype.Component;

@Component
public class DataService {

	public String[] getProgrammers(){
		
		String p[]={"Rob","Mac","Clay","Ceaser","Levis","Matt","Fulkner","Johny"};
		return p;
	}
}
