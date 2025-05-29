/*Write a Java program that implements the Comparable interface to sort a list of students 
based on their names in lexicographical order. Modify the compareTo method in the Student 
class to compare students by their names. Ensure that the program displays the list of 
students before and after sorting.
Note: The Student class must contain int id, String name, int marks, int roll*/

package HomeWork;
import java.util.*;
class Student implements Comparable<Student> {
    int id;
    String name;
    int marks;
    int roll;

    public Student(int id, String name, int marks, int roll) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.roll = roll;
    }

    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks + ", Roll: " + roll;
    }
}

public class Q2 {
    public static void main(String[] args) {
        // Creating a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Arpit", 85, 101));
        students.add(new Student(2, "Sourav", 78, 102));
        students.add(new Student(3, "Martian", 92, 103));
        students.add(new Student(4, "Sauvik", 88, 104));

        // Displaying the list before sorting
        System.out.println("Before Sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sorting the students based on name
        Collections.sort(students);

        // Displaying the list after sorting
        System.out.println("\nAfter Sorting (by name lexicographically):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}