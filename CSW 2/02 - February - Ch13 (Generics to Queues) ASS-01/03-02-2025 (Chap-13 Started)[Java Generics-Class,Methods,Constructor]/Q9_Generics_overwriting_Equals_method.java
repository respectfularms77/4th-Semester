class Car {
	String brand,model, registrationNumber;
	Car(String brand, String model, String registrationNumber) {
		this.brand = brand;
		this.model = model;
		this.registrationNumber = registrationNumber;
	}
	public boolean equals(Object o) {
		if (o instanceof Car) {
			Car car = (Car) o;
			if (car.brand == this.brand && car.model == this.model && car.registrationNumber == this.registrationNumber) {
				return true;
			} 
			else {
				return false;
			}
		} 
		else {
			return false;
		}
	}
}

public class Q9_Generics_overwriting_Equals_method {
    public static void main(String[] args) {
		Car myCar = new Car("Mercedez Benz","M Class", "OD13 0007");
		Car carInGarage = new Car("Mercedez Benz","A Class", "OD13 0007");
		if (myCar.equals(carInGarage)) {
			System.out.println("Yay!!! This is my Car!");
		}
		else  {
			System.out.println("That's Not My Car !!");
		}
	}
}