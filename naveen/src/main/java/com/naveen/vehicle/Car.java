package com.naveen.vehicle;

public class Car{
	
	private String modelName;
	private String modelYear;
	private Engine engine;
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void printCarInfo()
	{
		System.out.println("Car Name:"+modelName);
		System.out.println("Car Model Year:"+modelYear);
		System.out.println("Engine Name:"+engine.getName());
		System.out.println("Engine Weight:"+engine.getWeight()+"KG");
		System.out.println("Engine Size:"+engine.getSize());
	}

}
