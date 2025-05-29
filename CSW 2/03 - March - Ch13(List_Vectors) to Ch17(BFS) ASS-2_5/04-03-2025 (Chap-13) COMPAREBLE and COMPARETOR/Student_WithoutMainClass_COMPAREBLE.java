import java.util.*;				//Collections and 
public class Student_WithoutMainClass_COMPAREBLE implements Comparable<Student_WithoutMainClass_COMPAREBLE> {
	String name;	int roll;	String phone;	double marks;
	Student_WithoutMainClass_COMPAREBLE(String nm,int r,String p,double m){
		name=nm;	roll=r;		phone=p;		marks=m;
	}
	public int compareTo(Student_WithoutMainClass_COMPAREBLE other) {
		return this.name.compareTo(other.name);				//Lexicographical Comparision
	}
	public String getname()			{	return name;	}
	public int getroll()			{	return roll;	}
	public String getphone()		{	return phone;	}
	public double getmarks()		{	return marks;	}
	
	public String toString() {
		return "Student [Name: "+name+", Phone: "+phone+", Roll: "+roll+", Marks: "+marks+"]";
	}
}