import java.io.File;
public class P7_Deleting_A_File {
	public static void main(String[] args) {
		File f0 = new File("A:\\Programs\\HTML & CSS (from Sems)\\4th Semester\\CSW-2\\25-03-2025 [Chap-16] IO Concepts\\FileOperationExample.txt");
		if (f0.delete()) {
			System.out.println("File Name: "+f0.getName()+" is SuccessFully Deleted.");
		}
		else {
			System.out.println("Unexpected Error Found in Deletion of File");
		}
	}
}