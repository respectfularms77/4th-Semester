public class Q1_StringComparison {
    public static void main(String[] args) {
        String str1 = "Arpit", str2 = "Arpit";
        String str3 = new String("Arpit"), str4 = new String("Arpit");

        System.out.println("Comparing memory locations:");
        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1 == str3 : " + (str1 == str3));
        System.out.println("str3 == str4 : " + (str3 == str4));

        System.out.println("\nComparing actual string values:");
        System.out.println("str1.equals(str2) : " + str1.equals(str2));
        System.out.println("str1.equals(str3) : " + str1.equals(str3));
        System.out.println("str3.equals(str4) : " + str3.equals(str4));

        String str5 = str3.intern();
        System.out.println("\nAfter interning str3:");
        System.out.println("str1 == str5 : " + (str1 == str5));

        Runtime runtime = Runtime.getRuntime();
        long beforeMemory = runtime.freeMemory();
        System.out.println("\nMemory before: " + beforeMemory + " bytes");

        for (int i = 0; i < 10000; i++) new String("MemoryTest");

        long afterMemory = runtime.freeMemory();
        System.out.println("Memory after: " + afterMemory + " bytes");
        System.out.println("Memory difference: " + (beforeMemory - afterMemory) + " bytes");
    }
}