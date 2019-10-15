package com.naveen.spring.naveen;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
  
    	ApplicationContext context;
    	context = new ClassPathXmlApplicationContext("resources/beans.xml");
    	
    	Information info = context.getBean("information",Information.class);
    	
    	info.getMessage();
    	
		
    }
}
