package com.naveen.spring.naveen;

public class Information {

	private String name;
	private String gender;
	private int age;
	private Hello h;

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setH(Hello h) {
		this.h = h;
	}

	public Information(String name, String gender, String age) {
	
	}
	
	public Information(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public Information(String name, String gender) {
	}

	/*
	 * public void setAge(int age) { this.age = age; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public void setGender(String gender) { this.gender = gender; }
	 */
	public void getInfo() {
		System.out.println("name: " + name + "______Gender: " + gender + "____age:" + age);
	}
	
	public void getMessage()
	{
		h.message();
	}

}
