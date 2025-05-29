import java.util.*;
public class Q6_ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = {19, 47, 2, 56, 90, 100, 1, 45};

        System.out.print("Array before Sorting: ");
        for (int e : ar) {            System.out.print(e + " ");        }

        Arrays.sort(ar);
        
        System.out.print("\nArray after Sorting: ");
        for (int e : ar) {            System.out.print(e + " ");        }

        System.out.print("\nEnter a number to search for: ");
        if (sc.hasNextInt()) {
            int target = sc.nextInt();
            int index = Arrays.binarySearch(ar, target);
            
            if (index >= 0) {
                System.out.println("Number found at index: " + index);
            } else {
                System.out.println("Number not found in the array.");
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
            sc.next(); // Clear invalid input
        }

        try {
            System.out.print("Enter an index to get an element: ");
            if (sc.hasNextInt()) {
                int index = sc.nextInt();
                System.out.println("Number at index " + index + " is: " + ar[index]);
            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index! Please enter a value between 0 and " + (ar.length - 1));
        }
        sc.close();
    }
}