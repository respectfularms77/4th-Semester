class College {
    String CollegeName,CollegeLoc;
    public College(String CollegeName,String CollegeLoc)    {
        this.CollegeName=CollegeName;
        this.CollegeLoc=CollegeLoc;
    }
    public String getCollegeName(){
        return CollegeName;
    }
    public String getCollegeLoc(){
        return CollegeLoc;
    }
}
class Student {
    int StudentId;      String StudentName;     College college;
    public Student(int stid,String stnm,College cl){
        StudentId=stid;
        StudentName=stnm;
        college=cl;
    }
    public void displayStudentInfo() {
        System.out.println("Student Id: "+StudentId+"\nStudent Name: "+StudentName+"\nCollege Name: "+college.getCollegeName()+"\nColleger Location: "+college.getCollegeLoc());
    }
}
public class Q6 {
    public static void main(String[] args) {
        College c1=new College("Siksha O Anushandhan","Bhubaneswar");
        College c2=new College("BITS", "Pilani");

        Student s1=new Student(1001,"Arpit Kumar Mohanty",c1);
        Student s2=new Student(7650,"Roshan Mishra",c2);

        s1.displayStudentInfo();
        System.out.println("\n");
        s2.displayStudentInfo();
    }
}