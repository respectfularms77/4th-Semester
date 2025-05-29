class Employee {
    String name;    int id;    double salary;
    public Employee(String nm,int id,double sal)    {name=nm;   this.id=id;     salary=sal;}
    public void display(){
        System.out.print("Name: "+name+"\t ID is: "+id+"\tSalary is: "+salary);
    }
}
class Manager extends Employee{
    String depart;
    public Manager(String nm,int id,double sal,String depart)   {super(nm,id,sal);      this.depart=depart;}
    public void display(){
        super.display();
        System.out.println("\tDepartment is: "+depart);
    }
}

public class CW3_Single_Level_Inheritance_Employee_Manager {
    public static void main(String args[]) {
        System.out.println("Employee Details: ----->");
        Employee ob1=new Employee("Arpit Kumar",1234,20000.0);
        ob1.display();
        System.out.println("\nManager Details: ----->");
        Manager ob2=new Manager("Rohan Kumar",1235,40000.0,"HRs");
        ob2.display();
    }
}