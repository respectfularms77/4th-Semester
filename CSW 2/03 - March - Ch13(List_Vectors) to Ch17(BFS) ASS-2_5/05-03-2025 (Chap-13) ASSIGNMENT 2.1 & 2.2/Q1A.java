class Pair1<K, V> {
    private K key;
    private V value;

    // Parameterized constructor
    public Pair1(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Getter for key
    public K getKey() {
        return key;
    }

    // Setter for key
    public void setKey(K key) {
        this.key = key;
    }

    // Getter for value
    public V getValue() {
        return value;
    }

    // Setter for value
    public void setValue(V value) {
        this.value = value;
    }

    // Override toString() for displaying key-value Pair1
    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }
}

public class Q1A {
    public static void main(String[] args) {
        // Creating Pair1 objects
        Pair1<Integer, String> Pair11 = new Pair1<>(1, "One");
        Pair1<String, Double> Pair12 = new Pair1<>("Pi", 3.14159);
        Pair1<Character, Boolean> Pair13 = new Pair1<>('A', true);

        // Retrieving and printing key-value Pair1s
        System.out.println("Pair1 1: " + Pair11);
        System.out.println("Pair1 2: " + Pair12);
        System.out.println("Pair1 3: " + Pair13);
    }
}
