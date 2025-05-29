import java.util.*;
public class Q11 {
    public static void main(String[] args) {
        int[] arr = {7, 3, 9, 1, 5, 8, 2, 10, 6, 4};
        
        // Create a min-heap (PriorityQueue)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // Insert elements into the min-heap
        for (int i = 0; i < arr.length; i++) {
            minHeap.add(arr[i]);
        }

        // Dequeue elements and print them
        System.out.println("Elements in sorted order:");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }
}