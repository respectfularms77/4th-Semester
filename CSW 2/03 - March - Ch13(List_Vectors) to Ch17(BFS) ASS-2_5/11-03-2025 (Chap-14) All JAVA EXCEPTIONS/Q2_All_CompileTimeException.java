import java.io.*;
import java.lang.reflect.*;

public class Q2_All_CompileTimeException {
    
    public static void demonstrateClassNotFoundException() throws ClassNotFoundException {
        Class.forName("NonExistentClass"); // This will trigger ClassNotFoundException
    }
    
    public static void demonstrateFileNotFoundException() throws FileNotFoundException {
        FileReader file = new FileReader("non_existent_file.txt"); // This will trigger FileNotFoundException
    }
    
    public static void demonstrateIOException() throws IOException {
        File file = new File("test.txt");
        FileReader reader = new FileReader(file); // IOException may occur if there's an issue with file reading
        reader.close();
        reader.read(); // Attempting to read after closing will cause IOException
    }
    
    public static void demonstrateNoSuchFieldException() throws NoSuchFieldException {
        Class<Q2_All_CompileTimeException> cls = Q2_All_CompileTimeException.class;
        Field field = cls.getDeclaredField("nonExistentField"); // This will trigger NoSuchFieldException
    }
    
    public static void demonstrateNoSuchMethodException() throws NoSuchMethodException {
        Class<Q2_All_CompileTimeException> cls = Q2_All_CompileTimeException.class;
        Method method = cls.getDeclaredMethod("nonExistentMethod"); // This will trigger NoSuchMethodException
    }
    
    public static void main(String[] args) {
        /* ClassNotFoundException */
        try {
            System.out.println("\nDemonstrating ClassNotFoundException:");
            demonstrateClassNotFoundException();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        /* FileNotFoundException */
        try {
            System.out.println("\nDemonstrating FileNotFoundException:");
            demonstrateFileNotFoundException();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        /* IOException */
        try {
            System.out.println("\nDemonstrating IOException:");
            demonstrateIOException();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        /* NoSuchFieldException */
        try {
            System.out.println("\nDemonstrating NoSuchFieldException:");
            demonstrateNoSuchFieldException();
        } catch (NoSuchFieldException e) {
            System.out.println(e.getMessage());
        }
        
        /* NoSuchMethodException */
        try {
            System.out.println("\nDemonstrating NoSuchMethodException:");
            demonstrateNoSuchMethodException();
        } catch (NoSuchMethodException e) {
            System.out.println(e.getMessage());
        }
    }
}