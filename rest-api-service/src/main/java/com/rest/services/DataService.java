package com.rest.services;

import org.springframework.stereotype.Service;

@Service
public class DataService {
	public String[] getName(){
    String n[]={
    		"Glenn",
    		"George",
    		"Naman",
    		"Clinton",
    		"Johny"
    };
    return n;
}
}
