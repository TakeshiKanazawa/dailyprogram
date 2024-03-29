package Day34;

import java.util.Scanner;

// 行列の積
//n * mの行列Aと	m * lの行列Bを入力し、それらの積であるn * lの行列Cを出力するプログラム
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		int[][] matrix_A = new int[n][m];
		int[][] matrix_B = new int[m][l];
		int[][] matrix_C = new int[n][l];
		
		//行列A
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix_A[i][j] = sc.nextInt();
			}
		}
		
		//行列B
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < l; j++) {
				matrix_B[i][j] = sc.nextInt();
			}
		}
		//行列C
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {
				for (int k = 0; k < m; k++) {
					matrix_C[i][j] += matrix_A[i][k]*matrix_B[k][j];
			}
		}
	}
		//n*lの行列Cの要素を出力。各行の隣り合う要素を1つの空白で区切る
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {
				if(j > 0) {
					System.out.println(" ");
					 System.out.print( matrix_C[i][j]);
				}
				System.out.println();
			}
		}
	}
}