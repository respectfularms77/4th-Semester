public class Q4 {
    static int[][] A = { { 1, 2 }, { 3, 4 } }, B = { { 5, 6 }, { 7, 8 } }, C = new int[2][2];

    static class Multiply extends Thread {
        int row;
        Multiply(int row) {
            this.row = row;
        }
        public void run() {
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    C[row][j] += A[row][k] * B[k][j];
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Multiply t1 = new Multiply(0);
        Multiply t2 = new Multiply(1);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(java.util.Arrays.deepToString(C));
    }
}