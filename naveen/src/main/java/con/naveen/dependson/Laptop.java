package con.naveen.dependson;

public class Laptop {
private Motherboard motherboard;

public Motherboard getMotherboard() {
	return motherboard;
}

public void setMotherboard(Motherboard motherboard) {
	this.motherboard = motherboard;
}

public Laptop()
{
	System.out.println("Laptop object is created");
}
}
