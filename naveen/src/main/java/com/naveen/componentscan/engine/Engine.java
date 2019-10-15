package com.naveen.componentscan.engine;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	@Value("default engine")
	private String name;
	public String getName()
	{
		return name;
	}
	
	

}
