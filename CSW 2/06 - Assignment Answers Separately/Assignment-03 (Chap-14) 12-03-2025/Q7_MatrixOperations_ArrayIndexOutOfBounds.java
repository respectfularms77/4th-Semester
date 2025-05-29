import java.util.*; 
public class Q7_MatrixOperations_ArrayIndexOutOfBounds {   

    public static int[][] addMatrices(int[][] m1, int[][] m2) {
        int rows = m1.length, cols = m1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] m1, int[][] m2) {
        int rows = m1.length, cols = m2[0].length, common = m2.length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {                System.out.print(value + " ");            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] m1 = {{1, 2, 3}, {3, 4, 7}, {31, 45, 70}};
        int[][] m2 = {{10, 31, 34}, {32, 47, 73}, {38, 90, 69}};

        System.out.println("Matrix 1:");
        printMatrix(m1);

        System.out.println("\nMatrix 2:");
        printMatrix(m2);

        System.out.println("\nMatrix Addition Result:");
        printMatrix(addMatrices(m1, m2));

        System.out.println("\nMatrix Multiplication Result:");
        printMatrix(multiplyMatrices(m1, m2));

        System.out.println("\nTranspose of Matrix 1:");
        printMatrix(transposeMatrix(m1));

        try {
            System.out.print("\nEnter row and column index to access an element: ");
            int r = sc.nextInt();            int c = sc.nextInt();
            System.out.println("Matrix-1 Element: " + m1[r][c] + ", Matrix-2 Element: " + m2[r][c]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Please enter values between 0 and " + (m1.length - 1));
        }
        sc.close();
    }
}