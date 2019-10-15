package com.naveen.dao2.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naveen.dao2.bo.StudentBo;
import com.naveen.dao2.model.Student;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/dao2_beans.xml");
		
		Student student = new Student();
		student.setName("Mahira");
		student.setEmail("mahira@gmail.com");
		student.setRollNo(1034);
		
		
		StudentBo[] stb = new StudentBo[30];
		
		for(int i = 0; i < 30 ; i++)
		{
			stb[i] = (StudentBo)context.getBean("studentBo");
			System.out.println(stb[i].create(student));
			
			
		}

		
		
	}

}
