/*Write a Java program that implements the Comparator interface to sort a list of 
numbers based on the last digit of each number. The Number class should define a 
compare method that compares two numbers by their last digits. If two numbers have 
the same last digit, they should be considered equal. */

import java.util.*;
class LastDigitComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer n1, Integer n2) {
        int lastDigit1 = n1 % 10;
        int lastDigit2 = n2 % 10;
        return Integer.compare(lastDigit1, lastDigit2);
    }
}
public class Q4 {
    public static void main(String[] args) {
        // Creating a list of numbers
        List<Integer> numbers = new ArrayList<>(Arrays.asList(23, 89, 2, 105, 57, 69, 39, 07, 44));

        // Displaying the list before sorting
        System.out.println("Before Sorting: " + numbers);

        // Sorting using the LastDigitComparator
        Collections.sort(numbers, new LastDigitComparator());

        // Displaying the list after sorting
        System.out.println("After Sorting (by last digit): " + numbers);
    }
}