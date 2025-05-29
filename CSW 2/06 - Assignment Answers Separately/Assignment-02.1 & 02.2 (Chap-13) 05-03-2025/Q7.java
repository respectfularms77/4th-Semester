import java.util.*;
class Address {
    int plotNo;    String at;    String post;

    public Address(int plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }

    @Override
    public String toString() {
        return "Plot No: " + plotNo + ", At: " + at + ", Post: " + post;
    }
}

public class Q7 {
    public static void main(String[] args) {
        TreeMap<String, Address> addressMap = new TreeMap<>();

        // Adding entries to the TreeMap
        addressMap.put("Arpit", new Address(159, "ABC Lane", "Delhi"));
        addressMap.put("Bhuvan", new Address(202, "BCD Lane", "BBSR"));
        addressMap.put("Chinmayee", new Address(893, "EDC Lane", "Puri"));

        // Using an iterator to display the entries
        Iterator<Map.Entry<String, Address>> iterator = addressMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Address> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Address: " + entry.getValue());
        }
    }
}