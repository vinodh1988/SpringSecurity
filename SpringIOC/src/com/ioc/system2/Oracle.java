package com.ioc.system2;

import org.springframework.stereotype.Component;

@Component("oauth")
public class Oracle implements Authorization{

	@Override
	public void authorize() {
		// TODO Auto-generated method stub
		System.out.println("Oracle Authorized partner");
	}

}
