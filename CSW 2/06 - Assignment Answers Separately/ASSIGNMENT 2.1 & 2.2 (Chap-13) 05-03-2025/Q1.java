// Generic Pair Class
class Pair<K, V> {
    private K key;    private V value;
    // Parameterized Constructor
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }
    // Setters
    public void setKey(K key) { this.key = key; }
    public void setValue(V value) { this.value = value; }
}

public class Q1 {
    public static void main(String args[]) {
        // Creating Pair objects with different types
        Pair<Integer, String> p1 = new Pair<>(10, "One");
        Pair<String, Double> p2 = new Pair<>("Price", 99.99);

        // Retrieving and printing values
        System.out.println("Pair 1 - Key: " + p1.getKey() + ", Value: " + p1.getValue());
        System.out.println("Pair 2 - Key: " + p2.getKey() + ", Value: " + p2.getValue());
    }
}