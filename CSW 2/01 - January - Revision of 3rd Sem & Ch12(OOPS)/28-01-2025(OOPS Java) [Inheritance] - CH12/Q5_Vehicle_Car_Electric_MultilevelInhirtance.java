class Vehicle{
	String make,model;
	public Vehicle(String mk,String model)	{ 
		make=mk;			this.model=model;
	}
	public void display() {
		System.out.println("Car made in Country: "+make+"\nCar's Model: "+model);
	}
}

class Car extends Vehicle{
	int noofd; String fuelt;
	public Car(String mk,String model,int nod,String fuelt)	{
		super(mk,model);
		noofd=nod;			this.fuelt=fuelt;
	}
	public void display() {
		super.display();
		System.out.println("Car has number of Doors: "+noofd+"\nCar's Fuel Type: "+fuelt);
	}
}

class Electriccar extends Car {
	int batcapa,rangepercharge;
	public Electriccar(String mk,String model,int nod,String fuelt,int batc,int rpc)	{
		super(mk,model,nod,fuelt);
		batcapa=batc;
		rangepercharge=rpc;
	}
	public void display() {
		super.display();
		System.out.println("Car has battery Capacity: "+batcapa+"KWh\nCar's Range Per Charge: "+rangepercharge+"kms");
	}
}

public class Q5_Vehicle_Car_Electric_MultilevelInhirtance {
	public static void main(String[] args) {
		Electriccar ec=new Electriccar("USA","TSN0015",5,"Electric Type",75,600);
		ec.display();
	}
}