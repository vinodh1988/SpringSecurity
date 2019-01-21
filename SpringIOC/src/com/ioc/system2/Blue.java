package com.ioc.system2;

import org.springframework.beans.factory.annotation.Autowired;

public class Blue implements Institute{

	@Autowired
Authorization oauth;
	@Override
	public void build() {
		// TODO Auto-generated method stub
		System.out.println("Blue institute built");
		oauth.authorize();
	}

}
