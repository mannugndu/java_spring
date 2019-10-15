package com.naveen.collectioninjection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args)
	{
		ConfigurableApplicationContext context;
		context = new ClassPathXmlApplicationContext("resources/collectioninjection_beans.xml");
		CollectionTest test = (CollectionTest)context.getBean("collection");
		test.printData();
	}

}
