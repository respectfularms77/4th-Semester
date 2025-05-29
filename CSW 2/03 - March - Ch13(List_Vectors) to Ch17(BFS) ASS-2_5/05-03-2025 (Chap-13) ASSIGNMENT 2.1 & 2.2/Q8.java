import java.util.*;
public class Q8 {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str1.toCharArray())
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);

        for (char c : str2.toCharArray()) {
            if (!charCountMap.containsKey(c) || charCountMap.get(c) == 0) return false;
            charCountMap.put(c, charCountMap.get(c) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen", str2 = "silent";
        System.out.println(str1 + " and " + str2 + (areAnagrams(str1, str2) ? " are " : " are not ") + "anagrams.");
    }
}