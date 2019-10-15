package com.naveen.dao.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naveen.dao.bo.StudentBo;
import com.naveen.dao.model.Student;

public class App {
	
	public static void main(String[] args) throws Exception
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/dao_beans.xml");
		
		
		Student student = new Student();
		student.setEmail("manjit@gmail.com");
		student.setName("Manpreet singh");
		student.setRollNo(33);
		
		StudentBo studentbo = (StudentBo)context.getBean("studentBo");
		
		
		System.out.print(studentbo.createStudent(student));
		
		
		
		
		
		
	}

}
