import java.util.*;
class Student {
    private int studentId;    private String name;    private List<String> courses;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.courses = new ArrayList<>();
        System.out.println("Student " + name + " (ID: " + studentId + ") enrolled.");
    }
    // Enroll in a course
    public void enrollCourse(String course) {
        courses.add(course);
        System.out.println(name + " enrolled in: " + course);
    }

    // Withdraw from all courses (make eligible for garbage collection)
    public void withdraw() {
        courses.clear();
        System.out.println(name + " has withdrawn from all courses.");
    }

    protected void finalize() throws Throwable {
        System.out.println("Student " + name + " (ID: " + studentId + ") is being garbage collected.");
    }
}

public class Q7 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        // Memory before student enrollment
        long totalBefore = runtime.totalMemory();
        long freeBefore = runtime.freeMemory();
        System.out.println("\nMemory Before Enrollment - Total Heap: " + totalBefore + ", Free Heap: " + freeBefore);

        // Creating students
        Student student1 = new Student(69, "Arpit");
        Student student2 = new Student(78, "Ruchi");

        // Enrolling students in courses
        student1.enrollCourse("Computer Science & Engineering");
        student2.enrollCourse("Civil Engineering");

        // Memory after enrollment
        long totalAfterEnroll = runtime.totalMemory();
        long freeAfterEnroll = runtime.freeMemory();
        System.out.println("\nMemory After Enrollment - Total Heap: " + totalAfterEnroll + "\t Free Heap: " + freeAfterEnroll+"\n");

        // Withdraw students and make them eligible for GC
        student1.withdraw();
        student2.withdraw();

        student1 = null;
        student2 = null;

        // Request garbage collection
        System.out.println("\nRequesting Garbage Collection...");
        System.gc();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();        }

        // Memory after garbage collection
        long totalAfterGC = runtime.totalMemory();
        long freeAfterGC = runtime.freeMemory();
        System.out.println("\nMemory After Garbage Collection - Total Heap: " + totalAfterGC + "\t Free Heap: " + freeAfterGC);

        System.out.println("\nEnd of Enrollment System.");
    }
}