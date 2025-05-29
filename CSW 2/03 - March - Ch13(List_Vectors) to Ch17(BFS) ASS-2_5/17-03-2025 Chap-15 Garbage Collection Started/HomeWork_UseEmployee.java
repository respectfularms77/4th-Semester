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
}
public class HomeWork_UseEmployee {
    public static void main(String args[]) {
        Employee E = new Employee("Arpit K",20);
        Employee F = new Employee("Prikul",21);
        Employee G = new Employee("Harsdip",22);
        E.show();
        F.show();
        G.show();
        E.showNextID();
        F.showNextID();
        G.showNextID();
        {   //It is a sub block to keep all those interns
            Employee X = new Employee("Hardik",30);
            Employee Y = new Employee("Mantu M",32);
            X.show();
            Y.show();
            X.showNextID();
            Y.showNextID();
        }
        // After countering this brace, X & Y will be removed. Therefore, now it should show nextId as 4.
        //Output of this Line
        E.showNextID();
        // Should be 4 but give 6 as output
    }
}