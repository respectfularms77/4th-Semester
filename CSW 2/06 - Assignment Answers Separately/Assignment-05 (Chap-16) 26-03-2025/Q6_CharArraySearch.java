import java.util.*;
public class Q6_CharArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        char[] charArray = sc.nextLine().toCharArray();
        
        System.out.print("Enter character to search: ");
        char ch = sc.next().charAt(0);
        
        String str = new String(charArray);
        int first = str.indexOf(ch);
        int last = str.lastIndexOf(ch);
        
        System.out.println("Character Array: " + java.util.Arrays.toString(charArray));
        System.out.println(first == -1 ? "Character not found" : "First: " + first + ", Last: " + last);
        
        sc.close();
    }
}