class SumThread extends Thread {
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 100; i++)            sum += i;
        System.out.println("Sum of 1st 10 Natural Numbers: " + sum);
    }
}
class TableThread extends Thread {
    int num;
    TableThread(int num) {        this.num = num;    }
    public void run() {
        for (int i = 1; i <= 10; i++)
            System.out.println(num + " x " + i + " = " + (num * i));
    }
}
public class Q1 {
    public static void main(String[] args) {
        new SumThread().start();
        new TableThread(7).start();
    }
}