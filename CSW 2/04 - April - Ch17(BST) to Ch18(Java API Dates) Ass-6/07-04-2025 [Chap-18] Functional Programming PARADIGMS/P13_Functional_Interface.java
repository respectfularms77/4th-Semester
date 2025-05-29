@FunctionalInterface
interface Operation {
    int apply(int x, int y); // Abstract method
}
public class P13_Functional_Interface {
    public static void main(String[] args) {
        Operation add = (x, y) -> x + y;
        // Using lambda expression to implement the functional interface Operation add =
        // (x, y) -> x + y;
        System.out.println("Sum: " + add.apply(25, 10)); // Output: 15
    }
}