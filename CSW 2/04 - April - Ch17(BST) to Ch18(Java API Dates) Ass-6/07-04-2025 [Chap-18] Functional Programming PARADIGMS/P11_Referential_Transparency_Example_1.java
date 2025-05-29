public class P11_Referential_Transparency_Example_1 { 
    public int addonce (int a) { 
    // Pure function 
    return a + 2; // Always returns the same result for the same input 
    } 
    public static void main(String[] args) { 
    P11_Referential_Transparency_Example_1 example = new P11_Referential_Transparency_Example_1(); 
    System.out.println("Adding 2 to 5: " + example.addonce (5)); // Output: 7 
    }
}