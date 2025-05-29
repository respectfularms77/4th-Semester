public class Q3 {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("20 + 5 = " + (20 + 5))).start();
        new Thread(() -> System.out.println("30 - 5 = " + (30 - 5))).start();
        new Thread(() -> System.out.println("40 * 5 = " + (40 * 5))).start();
        new Thread(() -> System.out.println("50 / 5 = " + (50 / 5))).start();
    }
}