import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class P6_Reading_To_File {
	public static void main(String[] args) {
		try {
			File f0 = new File("A:\\Programs\\HTML & CSS (from Sems)\\4th Semester\\CSW-2\\25-03-2025 [Chap-16] IO Concepts\\FileOperationExample.txt");
			Scanner sc=new Scanner(f0);
			while(sc.hasNextLine()) {
				String fileData = sc.nextLine();
				System.out.println(fileData);
			}
			sc.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("UnExpected Error Occured");
			e.getMessage();
		}
	}
}