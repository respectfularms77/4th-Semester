import java.util.Scanner;
public class Q5_CaseConversionComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        
        System.out.println("Lowercase: " + str1.toLowerCase() + " | " + str2.toLowerCase());
        System.out.println("Uppercase: " + str1.toUpperCase() + " | " + str2.toUpperCase());
        System.out.println("Case-insensitive equality: " + str1.equalsIgnoreCase(str2));
        sc.close();
    }
}