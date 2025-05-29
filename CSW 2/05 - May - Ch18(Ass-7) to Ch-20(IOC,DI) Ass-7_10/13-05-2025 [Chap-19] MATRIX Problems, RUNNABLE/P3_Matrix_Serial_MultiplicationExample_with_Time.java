import java.util.Arrays;
import java.util.Random;
public class P3_Matrix_Serial_MultiplicationExample_with_Time {

	public static void main(String[] args) {
		int[][] FirstMatrix=GenerateMatrix(3,3);
		int[][] SecondMatrix=GenerateMatrix(3,3);;
		
		//System.out.println(Arrays.deepToString(MulitplyMatrix(FirstMatrix,SecondMatrix)));

		System.out.println("First Matrix:");
		printMatrix(FirstMatrix);
		System.out.println("\nSecond Matrix:");
		printMatrix(SecondMatrix);
		long startTime = System.currentTimeMillis();
		int[][] result = MulitplyMatrix(FirstMatrix, SecondMatrix);
		long endTime = System.currentTimeMillis();
		System.out.println("\nResult Matrix:");
		printMatrix(result);
		System.out.println("\nStart Time: "+startTime+"ms\tEnd Time: "+endTime+"ms\nTotal time is " + (endTime - startTime) + " ms");

	}
	public static int[][] MulitplyMatrix(int[][] m1,int[][] m2){
		int r1=m1.length;
		int c1=m1[0].length;
		int c2=m2[0].length;
		int res[][] = new int[r1][c2];
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				res[i][j]=0;
				for (int k = 0; k < c1; k++) {
				res[i][j]+=m1[i][k]*m2[k][j];	
				}
			}
		}
		return res;
	}
	public static int[][] GenerateMatrix(int r, int c) {
		int [][] mat=new int[r][c];
		Random ran=new Random();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				mat[i][j]=ran.nextInt(10);
			}
		}
		return mat;
	}

	public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}