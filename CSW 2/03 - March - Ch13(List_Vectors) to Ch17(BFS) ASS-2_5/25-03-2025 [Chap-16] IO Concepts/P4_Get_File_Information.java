import java.io.File;
public class P4_Get_File_Information {
	public static void main(String[] args) {
		File f0 = new File("A:\\\\Programs\\\\HTML & CSS (from Sems)\\\\4th Semester\\\\CSW-2\\\\25-03-2025 [Chap-16] IO Concepts\\\\FileOperationExample.txt");
		if (f0.exists()) {
			System.out.println("Getting the File Name: "+f0.getName());
			System.out.println("Getting the Absolute File Path: "+f0.getAbsolutePath());
			System.out.println("Is the File Writtable: "+f0.canWrite());
			System.out.println("Is the File Readable: "+f0.canRead());
			System.out.println("Getting the Size of File in Bytes: "+f0.length());
		}
		else {
			System.out.println("The File does not Exist");
		}
	}
}