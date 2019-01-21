package com.ioc.system2;

import org.springframework.stereotype.Component;

@Component("mauth")
public class Microsoft implements Authorization {

	@Override
	public void authorize() {
		// TODO Auto-generated method stub
		System.out.println("Microsoft authorized partner....");
	}

}
