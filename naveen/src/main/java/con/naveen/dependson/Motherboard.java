package con.naveen.dependson;

public class Motherboard {
	
	private Battery battery;

	
	public Motherboard()
	{
		System.out.println("MOtherboard object is created");
	}
	
	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	

}
