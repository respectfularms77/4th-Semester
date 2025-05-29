public class Q6 {
    static int seats = 5;
    public static void main(String[] args) {
        Runnable book = () -> {
            synchronized (Q6.class) {
                if (seats >= 3) {
                    System.out.println("3 seats booked");
                    seats -= 3;
                } else {
                    System.out.println("Not enough seats");
                }
            }
        };
        new Thread(book).start();
        new Thread(book).start();
        new Thread(book).start();
    }
}
