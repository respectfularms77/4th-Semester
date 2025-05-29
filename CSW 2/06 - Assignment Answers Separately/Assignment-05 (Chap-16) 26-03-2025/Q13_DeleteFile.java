import java.io.File;
import java.util.Scanner;

public class Q13_DeleteFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name to delete: ");
        File file = new File("A:\\Programs\\HTML & CSS (from Sems)\\4th Semester\\CSW-2\\26-03-2025 [Chap-16] [ASSIGNMENT - 5]"+sc.nextLine());
        
        System.out.println(file.exists() ? (file.delete() ? "File deleted." : "Deletion failed.") : "File not found.");
        sc.close();
    }
}
