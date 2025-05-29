import java.io.*;
import java.util.Scanner;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class Q16_FileMetadata {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String directoryPath = "A:\\Programs\\HTML & CSS (from Sems)\\4th Semester\\CSW-2\\26-03-2025 [Chap-16] [ASSIGNMENT - 5]"; // Set your desired directory path
        
        System.out.print("Enter file name: ");
        File file = new File(directoryPath + sc.nextLine());
        
        if (!file.exists()) {
            System.out.println("File not found in the specified directory.");
            sc.close();
            return;
        }
        
        BasicFileAttributes attr = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
        System.out.println("Size: " + file.length() + " bytes");
        System.out.println("Last Modified: " + Files.getLastModifiedTime(file.toPath()));
        System.out.println("Created: " + attr.creationTime());
        System.out.println("Is Directory: " + attr.isDirectory());
        
        sc.close();
    }
}
