package Day29;

import java.util.Scanner;

//ベクトルと行列の積
//n * mの行列Aと、m * 1の列ベクトルbを読み込み、Aとbの席を出力するプログラムを作成してください
//考察
//①行列Aは2次元配列に記録
//②ベクトルbは1次元配列に記録
//①と②の配列の値を加算して出力

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		//■Input
//		1行目にnとmが空白区切りで与えられます
		int n = sc.nextInt();
		int m = sc.nextInt();
		// 多次元配列
		 int[][]elementArray = new int[n][m];
//		続くn行に行列Aの要素aijが空白区切りで与えられます。
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				
				elementArray[i][j] = sc.nextInt();
			}
			
		}
//		続くm行にベクトルbの要素biがそれぞれ1行に与えられます。
		
		//■Output
		/* 出力はn行からなります。ベクトルcの要素ciをそれぞれ1行に出力してください。 */
	}
}