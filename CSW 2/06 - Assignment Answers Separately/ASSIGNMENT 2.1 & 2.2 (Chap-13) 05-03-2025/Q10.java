import java.util.*;
public class Q10 {
    public static int findMissingNumber(int[] arr) {
        HashMap<Integer, Integer> numberMap = new HashMap<>();
        
        // Store the elements in the HashMap
        for (int i = 0; i < arr.length; i++) {
            numberMap.put(arr[i], 1);
        }
        
        // Find the smallest missing number in the range 1 to 10
        for (int i = 1; i <= 10; i++) {
            if (!numberMap.containsKey(i)) {
                return i;
            }
        }
        
        return -1; // Return -1 if no missing number is found
    }
    
    public static void main(String[] args) {
        int[] arr = {20, 32, 47, 21, 38, 45, 26, 16, 14};
        System.out.println(findMissingNumber(arr) != -1 ? "The smallest missing number is: " + findMissingNumber(arr) : "No missing number in the range 1 to 10.");
    }
}