@FunctionalInterface
interface StringProcessor {
    int len(String s);
}
public class Q1_Functional_Interface {
    public static void main(String[] args) {
        String st = "Arpit Kumar";
        StringProcessor sp = (s) -> s.length();                                 //Here inplace of s, we write anythng except "st"
        System.out.println("Length of String "+st+" is: "+sp.len(st));          //But here while input we need to Give the exact word as input...
    }
}