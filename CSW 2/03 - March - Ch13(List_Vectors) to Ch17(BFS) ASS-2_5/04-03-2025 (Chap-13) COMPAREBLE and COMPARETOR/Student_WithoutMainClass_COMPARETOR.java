import java.util.*;
public class Student_WithoutMainClass_COMPARETOR {
    String name;	int roll;	String phone;	double marks;
	Student_WithoutMainClass_COMPARETOR(String nm,int r,String p,double m){
		name=nm;	roll=r;		phone=p;		marks=m;
	}
	public String getname()			{	return name;	}
	public int getroll()			{	return roll;	}
	public String getphone()		{	return phone;	}
	public double getmarks()		{	return marks;	}
	
	public String toString() {
		return "Student [Name: "+name+", Phone: "+phone+", Roll: "+roll+", Marks: "+marks+"]";
	}
}