package com.naveen.arrayinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/array_injection_car.xml");
		Car c = context.getBean("car",Car.class);
		c.printCarInfo();
		
	}

}
