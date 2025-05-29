import java.io.*;
import java.util.Scanner;

public class Q15_RenameFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String directoryPath = "A:\\Programs\\HTML & CSS (from Sems)\\4th Semester\\CSW-2\\26-03-2025 [Chap-16] [ASSIGNMENT - 5]"; // Set your desired directory path
        
        System.out.print("Enter current file name: ");
        File oldFile = new File(directoryPath + sc.nextLine());
        
        if (!oldFile.exists()) {
            System.out.println("File not found in the specified directory.");
            sc.close();
            return;
        }
        
        System.out.print("Enter new file name: ");
        File newFile = new File(directoryPath + sc.nextLine());
        
        System.out.println(oldFile.renameTo(newFile) ? "File renamed successfully." : "Rename failed.");
        sc.close();
    }
}
