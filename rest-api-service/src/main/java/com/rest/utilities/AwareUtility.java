package com.rest.utilities;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.RequestHandledEvent;

@Component
public class AwareUtility implements ApplicationContextAware,ResourceLoaderAware,
ApplicationListener<RequestHandledEvent>{

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("#############Application Context##################");
	}

	@Override
	public void setResourceLoader(ResourceLoader arg0) {
		// TODO Auto-generated method stub
		System.out.println("%%%%%%%%%%%% Resources Loaded %%%%%%%%%%%%%%%%%%%%%%");
	}

	@Override
	public void onApplicationEvent(RequestHandledEvent event) {
		// TODO Auto-generated method stub
		System.out.println("-///////////////-- Request Handled ---///////////////");
	}
	
	

}
