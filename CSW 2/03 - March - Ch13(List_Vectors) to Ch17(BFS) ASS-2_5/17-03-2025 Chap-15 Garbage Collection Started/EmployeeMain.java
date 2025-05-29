public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee("GFG1", 56);
        Employee e2 = new Employee("GFG2", 45);
        Employee e3 = new Employee("GFG3", 25);

        e1.show();
        e2.show();
        e3.show();

        e3.showNextId(); // Shows next available ID before deletion
        e3.showNextId();
        e3.showNextId();

        // Making e3 eligible for garbage collection
        e3 = null;
        System.gc();  // Requesting garbage collection

        // Creating new employees
        Employee e4 = new Employee("GFG4", 23);
        Employee e5 = new Employee("GFG5", 21);

        e4.show();
        e5.show();

        e5.showNextId();
        e5.showNextId();
        e5.showNextId();
    }
}