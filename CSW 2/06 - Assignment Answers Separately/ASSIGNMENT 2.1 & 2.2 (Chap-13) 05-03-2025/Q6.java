import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 10; i <= 50; i += 10) {            treeSet.add(i);        }

        // (a) Display the elements of the TreeSet
        System.out.println("TreeSet elements: " + treeSet);

        // (b) Check if a user-input number is present in the TreeSet
        System.out.print("Enter a number to check: ");
        int numberToCheck = sc.nextInt();
        System.out.println(numberToCheck + (treeSet.contains(numberToCheck) ? " is present in the TreeSet." : " is not present in the TreeSet."));
        
        // (c) Remove a specified element from the TreeSet
        System.out.print("Enter a number to remove: ");
        int numberToRemove = sc.nextInt();
        System.out.println(numberToRemove + (treeSet.remove(numberToRemove) ? " has been removed from the TreeSet." : " was not found in the TreeSet."));

        // Display updated TreeSet
        System.out.println("Updated TreeSet: " + treeSet); 
        sc.close();
    }
}