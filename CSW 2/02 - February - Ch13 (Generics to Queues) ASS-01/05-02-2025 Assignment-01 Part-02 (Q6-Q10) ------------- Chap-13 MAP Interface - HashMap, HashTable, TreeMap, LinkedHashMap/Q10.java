import java.util.*;

// Student class - Represents a university student (High Cohesion)
class Student {
    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}

// Course class - Represents a university course (High Cohesion)
class Course {
    private String courseCode;
    private String courseName;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }
}


// Interface for Enrollment System - Enables loose coupling
interface EnrollmentSystem {
    void enrollStudent(Student student, Course course);
    void dropStudent(Student student, Course course);
    void displayEnrollments();
}

// Enrollment class - Manages student enrollments (High Cohesion)

class Enrollment implements EnrollmentSystem {
    private Map<Student, List<Course>> enrollments = new HashMap<>();

    @Override
    public void enrollStudent(Student student, Course course) {
        enrollments.computeIfAbsent(student, k -> new ArrayList<>()).add(course);
        System.out.println(student.getName() + " enrolled in " + course.getCourseName());
    }

    @Override
    public void dropStudent(Student student, Course course) {
        if (enrollments.containsKey(student) && enrollments.get(student).remove(course)) {
            System.out.println(student.getName() + " dropped from " + course.getCourseName());
        } else {
            System.out.println("Enrollment not found.");
        }
    }

    @Override
    public void displayEnrollments() {
        for (Map.Entry<Student, List<Course>> entry : enrollments.entrySet()) {
            System.out.println(entry.getKey().getName() + " is enrolled in:");
            for (Course course : entry.getValue()) {
                System.out.println("- " + course.getCourseName());
            }
        }
    }
}

// Main class to test the enrollment system
public class Q10 {
    public static void main(String[] args) {
        Student s1 = new Student("S101", "Arpit");
        Student s2 = new Student("S102", "Aneek");

        Course c1 = new Course("CSE101", "Data Structures");
        Course c2 = new Course("CSE102", "OOP in Java");

        EnrollmentSystem enrollmentSystem = new Enrollment(); // Loose Coupling

        // Enroll students in courses
        enrollmentSystem.enrollStudent(s1, c1);
        enrollmentSystem.enrollStudent(s1, c2);
        enrollmentSystem.enrollStudent(s2, c1);

        System.out.println("-----------------");

        // Display enrollments
        enrollmentSystem.displayEnrollments();

        System.out.println("-----------------");

        // Drop a student from a course
        enrollmentSystem.dropStudent(s1, c2);
        
        System.out.println("-----------------");

        // Display enrollments after drop
        enrollmentSystem.displayEnrollments();
    }
}
