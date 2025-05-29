import java.util.*;     import java.io.*;

class CustomFileNotFoundException extends Exception {
    public CustomFileNotFoundException(String message) {
        super(message);
    }
}

class CustomFileReadPermissionException extends Exception {
    public CustomFileReadPermissionException(String message) {
        super(message);
    }
}

public class Q10_FileExceptionHandling {
    public static void main(String[] args) {
        try {
            File file = new File(args[0]);  // Directly accessing args[0]

            if (!file.exists()) {
                throw new CustomFileNotFoundException("Error: File does not exist!");
            }
            if (!file.canRead()) {
                throw new CustomFileReadPermissionException("Error: No read permission for the file!");
            }
            System.out.print("File Contents: ");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();  

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: File path not provided!");
        } catch (CustomFileNotFoundException | CustomFileReadPermissionException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Unexpected error: Unable to open the file.");
        }
    }
}