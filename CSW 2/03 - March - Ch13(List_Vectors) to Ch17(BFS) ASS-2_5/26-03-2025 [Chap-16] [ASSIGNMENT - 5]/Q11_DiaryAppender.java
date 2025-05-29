import java.io.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Q11_DiaryAppender {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new diary entry: ");
        String entry = "\n" + LocalDateTime.now() + "\n" + sc.nextLine();
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("A:\\Programs\\HTML & CSS (from Sems)\\4th Semester\\CSW-2\\26-03-2025 [Chap-16] [ASSIGNMENT - 5]\\diary.txt", true))) {
            writer.write(entry);
            System.out.println("Entry appended to diary.txt");
        }
        sc.close();
    }
}
