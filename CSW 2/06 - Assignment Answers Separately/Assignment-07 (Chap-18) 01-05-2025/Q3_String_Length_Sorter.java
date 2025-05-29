import java.util.*;
public class Q3_String_Length_Sorter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Arpit", "Sourav", "Sudhansu", "Ramunanjan R", "Arku");       //Immutable List
        //List<String> strings = new ArrayList<>(Arrays.asList("Java", "Python", "C", "JavaScript", "Go"));      //Mutable List

        strings.sort((str1, str2) -> Integer.compare(str2.length(), str1.length()));

        System.out.println("Strings sorted by length (descending):");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
