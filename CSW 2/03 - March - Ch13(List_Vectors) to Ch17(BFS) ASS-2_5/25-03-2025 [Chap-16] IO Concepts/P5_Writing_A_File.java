import java.io.FileWriter;
import java.io.IOException;
public class P5_Writing_A_File {
	public static void main(String[] args) {
		try {
			FileWriter fwrite = new FileWriter("A:\\Programs\\HTML & CSS (from Sems)\\4th Semester\\CSW-2\\25-03-2025 [Chap-16] IO Concepts\\FileOperationExample.txt");
			fwrite.write("This side Arpit is Talking to You");
			fwrite.close();
			System.out.println("Content is Written Successfully to the File");
		}catch (IOException e) {
			System.out.println("Unexpected Error Occured");
			e.getMessage();
		}
	}
}