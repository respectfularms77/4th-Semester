import java.util.*;
class User {
    private String name;
    private int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    // Display Method
    public void display() {
        System.out.println("Name: " + name + " | Age: " + age);
    }
}
public class ArrayListUser {
    public static void main(String[] args) {
        // Creating an ArrayList of User objects
        ArrayList<User> arl = new ArrayList<>();

        // Adding Users
        arl.add(new User("Arpit Kumar", 20));
        arl.add(new User("Manshik Kumar", 22));
        arl.add(new User("John Doe", 19));

        // Printing Users before Sorting
        System.out.println("Users before sorting:");
        for (User user : arl) {
            user.display();
        }

        // Sorting users by age
        Collections.sort(arl, Comparator.comparingInt(User::getAge));

        // Printing Users after Sorting
        System.out.println("\nUsers after sorting by age:");
        for (User user : arl) {
            user.display();
        }
    }
}