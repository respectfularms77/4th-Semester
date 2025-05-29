import java.util.*;
public class P14_Anamorphism_Example {
    static int nextInteger(int seed) {
        return seed + 1; // Generate the next integer by incrementing the seed
    }
    // Anamorphism to generate a sequence of consecutive integers
    static List<Integer> generateSequence(int seed, int count) {
        List<Integer> result = new ArrayList<>();
        int currentSeed = seed;
        for (int i = 0; i < count; i++) {
            result.add(currentSeed);
            currentSeed = nextInteger(currentSeed); // Generate the next integer
        }
        return result;
    }
    public static void main(String[] args) {
        int seed = 1; // Initial seed value
        int count = 5; // Number of integers to generate
        // Generate and print the sequence of consecutive integers
        List<Integer> sequence = generateSequence(seed, count);
        System.out.println("Sequence of consecutive integers: ");
        System.out.println(sequence);
    }
}