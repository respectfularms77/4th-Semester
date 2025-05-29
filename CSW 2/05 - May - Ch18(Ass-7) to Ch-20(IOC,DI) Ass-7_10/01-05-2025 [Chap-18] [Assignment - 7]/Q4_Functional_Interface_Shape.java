@FunctionalInterface
interface Shape {
    double area(double... params);
    default void display(String shapeName, double... params) {
        System.out.println("The Area of " + shapeName + " is: "+area(params));
    }
}

public class Q4_Functional_Interface_Shape {
    public static void main(String args[]) {
        Shape circle = (params) -> Math.PI * params[0] * params[0];
        Shape square = (params) -> params[0] * params[0];
        Shape rectangle = (params) -> params[0] * params[1];

        circle.display("Circle", 7);         
        square.display("Square", 5);         
        rectangle.display("Rectangle", 4, 6); 
    }
}
