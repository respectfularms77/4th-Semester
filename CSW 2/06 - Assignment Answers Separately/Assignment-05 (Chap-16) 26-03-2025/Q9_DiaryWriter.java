import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;
public class Q9_DiaryWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("A:\\Programs\\HTML & CSS (from Sems)\\4th Semester\\CSW-2\\26-03-2025 [Chap-16] [ASSIGNMENT - 5]\\diary.txt");
        if (file.exists()) {
            System.out.println("File already exists. Append new entries instead.");
            return;
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your diary entry: ");
        String entry = sc.nextLine();
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(LocalDate.now() + "\n" + entry);
            System.out.println("Diary entry saved to diary.txt");
        }
        sc.close();
    }
}