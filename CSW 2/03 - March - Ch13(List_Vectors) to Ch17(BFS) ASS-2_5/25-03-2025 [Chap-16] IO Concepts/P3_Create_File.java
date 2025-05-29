import java.io.File;
import java.io.IOException;
public class P3_Create_File {
	public static void main(String[] args) {
		File f0 = new File("A:\\Programs\\HTML & CSS (from Sems)\\4th Semester\\CSW-2\\25-03-2025 [Chap-16] IO Concepts\\FileOperationExample.txt");
		try {
			if (f0.createNewFile()) {
				System.out.println("File Name: "+f0.getName()+" is successfully Created !");
			}
			else {
				System.out.println("Files Already exits in Directory");
			}
		} catch (IOException e) {
			System.out.println("An Unexpected Error Occurs");
			e.getMessage();
		}
	}
}