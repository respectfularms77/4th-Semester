import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 5, 6, 7, 8, 6};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!seen.add(arr[i])) {
                duplicates.add(arr[i]);
            }
        }
        System.out.println("Repeating integers: " + duplicates);
    }
}