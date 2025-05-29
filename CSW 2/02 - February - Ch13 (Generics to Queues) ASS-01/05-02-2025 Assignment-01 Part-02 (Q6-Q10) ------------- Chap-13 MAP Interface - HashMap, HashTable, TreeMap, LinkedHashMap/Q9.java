interface Vehicle {
    public void accelerate();
    public void brake();

}
class Bicycle implements Vehicle {
    public void accelerate() {
        System.out.println("Bicycle is Acclerating");
    }
    public void brake() {
        System.out.println("Bicycle is Braking");
    }
    public void accelerate(int speed) {
        System.out.println("Bicycle is accelarated to Speed: "+speed+" km/h");
    }
    public void accelerate(int speed,int duration) {
        System.out.println("Bicycle is accelarated to Speed: "+speed+" km/h for "+duration+" minutes");
    }
}
class Car implements Vehicle {
    public void accelerate() {
        System.out.println("Car is Acclerating");
    }
    public void brake() {
        System.out.println("Car is Braking");
    }
    public void accelerate(int speed) {
        System.out.println("Car is accelarated to Speed: "+speed+" km/h");
    }
    public void accelerate(int speed,int duration) {
        System.out.println("Car is accelarated to speed "+speed+" km/h and for "+duration+" minutes");
    }
}

public class Q9 {
    public static void main(String args[]) {
        Vehicle car=new Car();
        Vehicle by=new Bicycle();

        car.accelerate();
        car.brake();
        by.accelerate();
        by.brake();

        System.out.println();

        // Test overloaded methods
        Car car1 = new Car();
        car1.accelerate(60);
        car1.accelerate(80, 5);

        System.out.println();

        Bicycle bicycle = new Bicycle();
        bicycle.accelerate(20);
        bicycle.accelerate(25, 3);
    }
}