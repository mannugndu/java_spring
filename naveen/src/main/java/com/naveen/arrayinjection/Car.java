package com.naveen.arrayinjection;

public class Car {

	private String[] names;
	private Engine[] engines;

	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}

	public Engine[] getEngines() {
		return engines;
	}

	public void setEngines(Engine[] engines) {
		this.engines = engines;
	}

	public void printCarInfo() {
		for (String name : names) {
			System.out.println("car name:"+name);
		}
		for (Engine engine : engines) {
			System.out.println("Engine name:"+engine.getName());

		}
	}

}
