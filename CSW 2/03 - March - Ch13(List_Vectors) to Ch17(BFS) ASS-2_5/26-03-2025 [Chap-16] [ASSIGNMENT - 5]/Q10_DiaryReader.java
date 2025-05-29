import java.io.*;
public class Q10_DiaryReader {
    public static void main(String[] args) {
        File file = new File("A:\\Programs\\HTML & CSS (from Sems)\\4th Semester\\CSW-2\\26-03-2025 [Chap-16] [ASSIGNMENT - 5]\\diary.txt");
        if (!file.exists()) {
            System.out.println("Error: File not found.");
            return;
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            System.out.println("Diary Content:\n" + reader.lines().reduce("", (a, b) -> a + "\n" + b));
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}