package com.ioc.system;

import org.springframework.stereotype.Component;

@Component("fquality")
public class CarQuality implements QualityCheck {

	@Override
	public void checkQuality() {
		// TODO Auto-generated method stub
		System.out.println("Car Quality check...");
	}

	
}
