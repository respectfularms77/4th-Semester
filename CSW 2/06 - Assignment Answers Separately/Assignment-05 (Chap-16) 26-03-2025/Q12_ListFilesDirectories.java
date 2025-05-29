import java.io.File;
import java.util.Scanner;

public class Q12_ListFilesDirectories {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter directory path: ");
        File dir = new File(sc.nextLine());
        
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Invalid directory.");
            sc.close();
            return;
        }
        
        String[] files = dir.list();
        System.out.println("Contents of directory:");
        for (String file : files) System.out.println(file);
        
        sc.close();
    }
}
