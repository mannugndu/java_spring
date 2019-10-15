package com.naveen.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Car {
	
	
	@Autowired
	@Qualifier("engine1")
	private Engine engine;

	

	public String getEngine() {
		return engine+" "+engine.getName();
	}

}
