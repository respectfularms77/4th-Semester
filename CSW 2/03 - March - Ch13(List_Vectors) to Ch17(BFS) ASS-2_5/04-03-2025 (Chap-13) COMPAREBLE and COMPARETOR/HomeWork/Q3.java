/*Write a Java program that implements the Comparator interface to sort a 
list of students based on their names in lexicographical order. 
Modify the compare method in the Student class to compare students by their names.
Ensure that the program displays the list of students before and after sorting. 
Write 3 Comparator implementation to sort the list of students using their marks 
(Descending Order), roll number, id.
 */
package HomeWork;
import java.util.*;

// Student class
class Student {
    int id;
    String name;
    int marks;
    int roll;

    // Constructor
    public Student(int id, String name, int marks, int roll) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.roll = roll;
    }

    // Override toString to display student details
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks + ", Roll: " + roll;
    }
}

// Comparator to sort students by Name (Lexicographical Order)
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

// Comparator to sort students by Marks (Descending Order)
class MarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.marks, s1.marks); // Descending Order
    }
}

// Comparator to sort students by Roll Number (Ascending Order)
class RollComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.roll, s2.roll);
    }
}

// Comparator to sort students by ID (Ascending Order)
class IDComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.id, s2.id);
    }
}

// Main Class
public class Q3 {
    public static void main(String[] args) {
        // Creating a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Sindhu", 92, 103));
        students.add(new Student(1, "Arpit", 85, 101));
        students.add(new Student(4, "Pratik", 88, 104));
        students.add(new Student(2, "Sourav", 78, 102));

        // Displaying the list before sorting
        System.out.println("Original List:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sorting by Name (Lexicographical Order)
        Collections.sort(students, new NameComparator());
        System.out.println("\nSorted by Name (Lexicographical Order):");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sorting by Marks (Descending Order)
        Collections.sort(students, new MarksComparator());
        System.out.println("\nSorted by Marks (Descending Order):");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sorting by Roll Number (Ascending Order)
        Collections.sort(students, new RollComparator());
        System.out.println("\nSorted by Roll Number (Ascending Order):");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sorting by ID (Ascending Order)
        Collections.sort(students, new IDComparator());
        System.out.println("\nSorted by ID (Ascending Order):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}