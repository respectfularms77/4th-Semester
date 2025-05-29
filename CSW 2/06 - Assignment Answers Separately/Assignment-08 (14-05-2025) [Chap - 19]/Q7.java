public class Q7 {
    public static void main(String[] args) {
        System.out.print("Prime numbers between 1 and 15:\t");
        new Thread(() -> {
            for (int i = 2; i <= 15; i++)
                if (isPrime(i))
                    System.out.print(i+"\t");
        }).start();
    }
    static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}