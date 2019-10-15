package com.naveen.componentscan.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.naveen.componentscan.engine.Engine;

@Component
public class Car {
	@Autowired
	private Engine engine;
	
	public Car()
	{
		System.out.println("Car bean is created");
		
	}
	public String getEngineName()
	{
		return engine.getName();
	}

}
