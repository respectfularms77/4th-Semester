class Employee {
    private int ID,age;
    private String name;
    private static int nextId = 1;
    //It is made static cuz to keep common among all and shared by all objects
    public Employee(String nm,int a) {
        name = nm;      age = a;        ID = nextId++;
    }
    public void show() {
		System.out.println("ID: "+ID+"\tName: "+name+"\tAge: "+age);
	}
    public void showNextID() {
        System.out.println("Next Employee id will be: "+nextId);
    }
    @Override
    protected void finalize()   throws Throwable {
        --nextId;  // Reduce the nextId when an Employee object is destroyed
    }
}

public class HomeWork_UseEmployee_P2 {
    public static void main(String args[]) {
        Employee E = new Employee("Arpit K", 20);
        Employee F = new Employee("Prikul", 21);
        Employee G = new Employee("Harsdip", 22);
        E.show();
        F.show();
        G.show();
        E.showNextID();
        F.showNextID();
        G.showNextID();

        {   // Inner block
            Employee X = new Employee("Hardik", 30);
            Employee Y = new Employee("Mantu M", 32);
            X.show();
            Y.show();
            X.showNextID();
            Y.showNextID();        
            X = Y = null;
            // Explicitly request garbage collection after X and Y are out of scope
            System.gc();
            System.runFinalization();
        }  // X and Y go out of scope here

        // Should now print "Next Employee id will be: 4"
        E.showNextID();
    }
}