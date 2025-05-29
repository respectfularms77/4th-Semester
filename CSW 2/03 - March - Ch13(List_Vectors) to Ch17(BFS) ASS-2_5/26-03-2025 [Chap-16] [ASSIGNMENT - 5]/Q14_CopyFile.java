import java.io.*;
import java.util.Scanner;

public class Q14_CopyFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter source file path: ");
        File src = new File("A:\\Programs\\HTML & CSS (from Sems)\\4th Semester\\CSW-2\\26-03-2025 [Chap-16] [ASSIGNMENT - 5]"+sc.nextLine());
        System.out.print("Enter destination file path: ");
        File dest = new File("A:\\Programs\\HTML & CSS (from Sems)\\4th Semester\\CSW-2\\26-03-2025 [Chap-16] [ASSIGNMENT - 5]"+sc.nextLine());
        
        if (!src.exists()) {
            System.out.println("Source file not found.");
            sc.close();
            return;
        }
        if (dest.exists()) {
            System.out.print("Destination file exists. Overwrite? (yes/no): ");
            if (!sc.next().equalsIgnoreCase("yes")) {
                sc.close();
                return;
            }
        }
        
        try (FileInputStream in = new FileInputStream(src); FileOutputStream out = new FileOutputStream(dest)) {
            out.write(in.readAllBytes());
            System.out.println("File copied successfully.");
        }
        sc.close();
    }
}