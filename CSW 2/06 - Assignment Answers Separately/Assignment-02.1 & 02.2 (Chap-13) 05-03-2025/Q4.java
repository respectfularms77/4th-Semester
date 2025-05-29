import java.util.*;
class Student {
    String name;    int age;    double mark;

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return age == student.age && Double.compare(student.mark, mark) == 0 && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, mark);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", mark=" + mark + "}";
    }
}

public class Q4 {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        students.add(new Student("Alice", 20, 85.5));
        students.add(new Student("Bob", 22, 90.0));
        students.add(new Student("Charlie", 19, 78.0));

        // (a) Display the list of students
        System.out.println("List of students:");
        for (Student s : students) {
            System.out.println(s);
        }

        // (b) Check for existence of a Student object
        System.out.println("\nEnter student details to search (name, age, mark):");
        String name = sc.next();
        int age = sc.nextInt();
        double mark = sc.nextDouble();
        Student searchStudent = new Student(name, age, mark);
        if (students.contains(searchStudent)) {
            System.out.println("Student found (content comparison).\n");
        } else {
            System.out.println("Student not found.\n");
        }

        // (c) Remove a Student object
        System.out.println("Enter student details to remove (name, age, mark):");
        name = sc.next();
        age = sc.nextInt();
        mark = sc.nextDouble();
        Student removeStudent = new Student(name, age, mark);
        if (students.remove(removeStudent)) {
            System.out.println("Student removed successfully.\n");
        } else {
            System.out.println("Student not found for removal.\n");
        }

        // (d) Count the number of students
        System.out.println("Total number of students: " + students.size());
        sc.close();
    }
}