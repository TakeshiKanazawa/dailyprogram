package Day40;

import java.util.Scanner;

//ABC 261 B問題
//N行 N列からなる試合の結果の表Aの内容の正誤判定を行う！

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Ans = "correct";

		int N = sc.nextInt();

		// N * N の二次元配列を作る
		char[][] array = new char[N][N];
		for (int i = 0; i < N; i++) {
				array[i] = sc.next().toCharArray();
				System.out.println(array[i]);
			}
		

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				// -
				if (i == j && array[i][j] != '-') {
					Ans = "incorrect";
				}

				// W
				if (array[i][j] == 'W' && array[j][i] != 'L') {
					Ans = "incorrect";
				}
				// L
				if (array[i][j] == 'L' && array[j][i] != 'W') {
					Ans = "incorrect";
				}

				// D
				if (array[i][j] == 'D' && array[j][i] != 'D') {
					Ans = "incorrect";
				}
			}
		}

		//
		// 与えられた表に矛盾がないとき correct、矛盾があるとき incorrect と出力せよ。
		System.out.println(Ans);

	}
}