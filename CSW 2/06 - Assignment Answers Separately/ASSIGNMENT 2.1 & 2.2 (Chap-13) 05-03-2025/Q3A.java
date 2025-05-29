import java.util.*;
class Car implements Comparable<Car> {
    private int modelNo;    private String name;    private int stock;

    public Car(int modelNo, String name, int stock) {
        this.modelNo = modelNo;
        this.name = name;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    // Override compareTo method to sort based on stock
    @Override
    public int compareTo(Car car) {
        return Integer.compare(this.stock, car.stock);
    }

    // Override toString for easy printing
    @Override
    public String toString() {
        return modelNo + " " + name + " " + stock;
    }
}

public class Q3A {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        // Adding Car objects to the ArrayList
        cars.add(new Car(2015, "BMW", 55));
        cars.add(new Car(2017, "Audi", 45));
        cars.add(new Car(2018, "Kia", 20));
        cars.add(new Car(2020, "MG", 13));
        cars.add(new Car(2013, "Creta", 10));
        // Sorting cars based on stock
        Collections.sort(cars);

        // Printing sorted car list
        System.out.println("Sorted list of cars:");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}