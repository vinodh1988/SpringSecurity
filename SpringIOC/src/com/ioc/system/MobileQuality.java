package com.ioc.system;

import org.springframework.stereotype.Component;

@Component("mquality")
public class MobileQuality implements QualityCheck {

	@Override
	public void checkQuality() {
		// TODO Auto-generated method stub
		System.out.println("Mobile Quality Check");
		
	}

}
