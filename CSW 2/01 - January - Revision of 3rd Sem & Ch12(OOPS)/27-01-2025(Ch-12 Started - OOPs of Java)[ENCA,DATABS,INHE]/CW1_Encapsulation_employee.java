class Em {
	private int employeeId;
	private String employeeName,designation;
	private double salary;
	public void setEmployeeId(int emid)			{		employeeId=emid;			}
	public int getEmployeeId()					{		return employeeId;			}
	
	public void setEmployeeName(String nm)		{		employeeName=nm;			}
	public String getEmployeeName()				{		return employeeName;		}
	
	public void setDesignation(String dg)		{		designation=dg;				}
	public String getDesgination()				{		return designation;			}
	
	public void setSalary(double sl)			{
		if(sl>0)		{salary=sl;}
		else {	System.out.println("Enter a Postive Value");	}
		}
	public double getSalary()					{		return salary;				}
}

public class CW1_Encapsulation_employee {
	public static void main(String[] args) {
		Em ob1=new Em();
		ob1.setEmployeeId(1234);
		ob1.setEmployeeName("Arpit Kumar");
		ob1.setDesignation("HR");
		ob1.setSalary(50000.0);
		System.out.println("All the Details are: -------->>		");
		System.out.println("Employee id: "+ob1.getEmployeeId()+"\nEmployee Name: "+ob1.getEmployeeName());
		System.out.println("Employee Designation: "+ob1.getDesgination()+"\nEmployee Salary: "+ob1.getSalary());
	}
}