package com.ioc.system2;

import org.springframework.beans.factory.annotation.Autowired;

public class Red implements Institute{

@Autowired
	Authorization oauth;
@Autowired	
	Authorization mauth;
	@Override
	public void build() {
		// TODO Auto-generated method stub
		System.out.println("Red Institute built");
		oauth.authorize();
		mauth.authorize();
	}

}
