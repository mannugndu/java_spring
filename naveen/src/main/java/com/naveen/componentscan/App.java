package com.naveen.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naveen.componentscan.car.Car;

public class App {

	
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/componentscan_beans.xml");
		Car c = (Car)context.getBean("car");
		System.out.println(c.getEngineName());
		
	
		
	}

}
