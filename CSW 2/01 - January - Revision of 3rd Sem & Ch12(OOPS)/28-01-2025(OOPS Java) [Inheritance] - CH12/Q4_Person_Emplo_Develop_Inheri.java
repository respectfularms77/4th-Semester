class Person {
	String name; int age;
	public Person(String nm,int a)	{
		name=nm;		age=a;
	}
	public void display()	{
		System.out.println("Name is: "+name+"\nAge is: "+age);
	}
}

class Employee extends Person {
	int employeeId;	double salary;
	public Employee(String nm,int a,int emid,double sal) {
		super(nm,a);
		employeeId=emid;	salary=sal;
	}
	public void display()	{
		super.display();
		System.out.println("Employee ID is: "+employeeId+"\nSalary is: "+salary);
	}
}

class Developer extends Employee {
	String progl,projnm;
	public Developer(String nm,int a,int emid,double sal,String progl,String projnm)	{
		super(nm,a,emid,sal);
		this.progl=progl;		this.projnm=projnm;
	}
	public void display()	{
		super.display();
		System.out.println("Developer's Language is: "+progl+"\nDEveloper's Project Name is: "+projnm);
	}	
}
public class Q4_Person_Emplo_Develop_Inheri {
	public static void main(String[] args) {
		Developer de=new Developer("Arpit Kumar",25,1234,50000.0,"Java","Eclipse Project");
		de.display();
	}
}