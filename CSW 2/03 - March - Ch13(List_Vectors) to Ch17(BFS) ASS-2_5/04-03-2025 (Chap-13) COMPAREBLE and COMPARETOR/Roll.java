import java.util.*;
public class Roll implements Comparator<Student_WithoutMainClass_COMPARETOR>{
	public int compare(Student_WithoutMainClass_COMPARETOR o1,Student_WithoutMainClass_COMPARETOR o2) {
		return o1.getroll()-o2.getroll();
	}
}