package com.naveen.autowire;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args)
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("resources/autowire_beans.xml");
		
		System.out.print(((Car)(context.getBean("car"))).getEngine());
		
	}

	

}
