package com.ioc.system;

import org.springframework.beans.factory.annotation.Autowired;

import com.ioc.aspect.MyAspect;

public class FourWheelerFactory implements Factory {

    Design arch;
	
	Produce produce;
	
	@Autowired
	QualityCheck fquality;
	
	@Autowired
	MyAspect aspect;
	


	public FourWheelerFactory(Design arch, Produce produce) {
		super();
		this.arch = arch;
		this.produce = produce;
	}


	

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("WE produce four Wheelers essentially cars");
		arch.designProduct();
		produce.produce();
		fquality.checkQuality();
	}

}
