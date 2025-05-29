import java.util.*;
public class Name implements Comparator<Student_WithoutMainClass_COMPARETOR>{
	public int compare(Student_WithoutMainClass_COMPARETOR o1,Student_WithoutMainClass_COMPARETOR o2) {
		return o1.getname().compareTo(o2.getname());
	}
}