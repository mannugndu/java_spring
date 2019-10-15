package com.naveen.vehicle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args)
	{
		// ==Creating the String array of xml files==
		String[] xmlFiles = new String[] {"resources/car.xml","resources/engine.xml"};
		
		ConfigurableApplicationContext context;
		context = new ClassPathXmlApplicationContext(xmlFiles);
		Car c  = (Car) context.getBean("car");
		c.printCarInfo();
	}

}
