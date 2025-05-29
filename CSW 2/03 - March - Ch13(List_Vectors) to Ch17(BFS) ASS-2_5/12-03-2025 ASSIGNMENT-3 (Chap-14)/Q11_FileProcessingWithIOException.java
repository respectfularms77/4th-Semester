import java.io.*;               import java.util.*;
public class Q11_FileProcessingWithIOException {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Taking file path as user input
        System.out.print("Enter the file path: ");
        String filePath = userInput.nextLine();

        // Try-Catch block to handle IOException
        try {
            File file = new File(filePath);

            // Checking if file exists
            if (!file.exists()) {
                throw new FileNotFoundException("Error: File does not exist!");
            }

            Scanner fileScanner = new Scanner(file);
            int lineCount = 0, wordCount = 0;

            System.out.println("\nFile Contents:");
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
                lineCount++;
                wordCount += line.split("\\s+").length; // Counting words in each line
            }

            // Display file processing results
            System.out.println("\nFile Processing Results:");
            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);

            // Closing scanners
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException occurred while reading the file.");
        } finally {
            userInput.close(); // Close user input scanner
        }
    }
}