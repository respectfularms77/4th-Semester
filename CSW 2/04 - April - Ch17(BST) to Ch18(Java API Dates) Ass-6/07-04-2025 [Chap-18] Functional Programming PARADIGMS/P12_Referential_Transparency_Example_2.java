class Adder { // A pure function that adds two integers
    public static int add(int a, int b) {
        a *= 2;
        return a + b;
    }
}
public class P12_Referential_Transparency_Example_2{
    public static void main(String[] args) { 
    int x = 5; 
    int y = 3; 
    // Using the add function 
    int result1 = Adder.add(x, y); // result1 = 13 
    // Replacing the function call with its value 
    int result2 = x + y; // result2 = 8 
    // Both results should be the same 
    System.out.println("Result 1: "+ result1); 
    System.out.println("Result 2: "+ result2); 
    }
}