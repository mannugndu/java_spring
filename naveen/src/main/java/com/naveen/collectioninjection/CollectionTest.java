package com.naveen.collectioninjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionTest {
	private List fruits;
	private Set colors;
	private Map countriesCaptials;
	public List getFruits() {
		return fruits;
	}
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	public Set getColors() {
		return colors;
	}
	public void setColors(Set colors) {
		this.colors = colors;
	}
	public Map getCountriesCaptials() {
		return countriesCaptials;
	}
	public void setCountriesCaptials(Map countriesCaptials) {
		this.countriesCaptials = countriesCaptials;
	}
	
	public void printData()
	{
		System.out.println("=======Fruits==========");
		for(Object fruit : fruits)
		{
			System.out.println(fruit);
		}
		System.out.println("=======Colors==========");
		for(Object color : colors)
		{
			System.out.println(color);
		}
		System.out.println("=======Countries an dCapitals==========");
		Set keys = countriesCaptials.keySet();
		for(Object key:keys)
		{
			System.out.println("Country:"+key+"capital:"+countriesCaptials.get(key));
		}
		
		
	}
	
	
	

}
