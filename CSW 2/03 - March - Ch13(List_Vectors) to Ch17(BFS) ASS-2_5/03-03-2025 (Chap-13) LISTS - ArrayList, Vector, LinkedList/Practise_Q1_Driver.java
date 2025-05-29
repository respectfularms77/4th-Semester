class Student {
    String name,Rlnum;
    int age;
    public Student(String name, int Rlnum, int age) {
        this.name = name;
        this.Rlnum = String.valueOf(Rlnum);       //Convert int to String
        this.age = age;
    }
    public Student(String name, String Rlnum, int age) {
        this.name = name;
        this.Rlnum = Rlnum;
        this.age = age;
    }
    public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + Rlnum);
        System.out.println("Age: " + age);
    }
}

public class Practise_Q1_Driver {
    public static void main(String[] args) {
        // Creating Student objects with different types of roll numbers
        Student student1 = new Student("Arpit Kumar", 101580, 20);
        Student student2 = new Student("Sourav Kumar", "CS2023A", 21);

        // Displaying Student details
        System.out.println("Student 1 Details:");
        student1.displayStudent();

        System.out.println("\nStudent 2 Details:");
        student2.displayStudent();
    }    
}