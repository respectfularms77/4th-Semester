import java.util.Arrays;
public class P4_Matrix_Serial_MultipliactionExample_with_Time_MultiThread_PARALLEL {
	// This program multiplies two matrices using multiple threads.
	// Each thread is responsible for calculating one row of the result matrix.
	public static void main(String[] args) {
		int[][] firstMatrix = generateMatrix(3, 3);
		int[][] secondMatrix = generateMatrix(3, 3);
		System.out.println("First Matrix:\t");
		printMatrix(firstMatrix);
		System.out.println("Second Matrix:\t");
		printMatrix(secondMatrix);
		long startTime = System.currentTimeMillis();
		int[][] result = new int[3][3];
		Thread[] threads = new Thread[3];
		for (int i = 0; i < 3; i++) {
			final int row = i;
			threads[i] = new Thread(() -> {
				for (int j = 0; j < 3; j++) {
					for (int k = 0; k < 3; k++) {
						result[row][j] += firstMatrix[row][k] * secondMatrix[k][j];
					}
				}
			});
			threads[i].start();
		}
		for (Thread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
		long endTime = System.currentTimeMillis();

		System.out.println("Result Matrix:");
		printMatrix(result);

		System.out.println("Start Time: " + startTime + "ms\tEnd Time: " + endTime + "ms\nTotal time is " + (endTime - startTime) + " ms");
	}

	public static int[][] generateMatrix(int rows, int columns) {
		int[][] matrix = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				matrix[i][j] = (int) (Math.random() * 10);
			}
		}
		return matrix;
	}

	public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
		System.out.println("---------------------");
    }
}