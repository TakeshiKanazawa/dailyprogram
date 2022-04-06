package Day6;

import java.util.Scanner;

class Main2 {

	/*
	 * 全探索と指数時間 N枚のカードが並べられている。左からi番目(i <= i <= N)のカードには 整数Aiが書かれている
	 * カードの中からいくつか選んで、合計がちょうどSとなる場合、Yesを出力
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// N枚のカード
		int N = sc.nextInt();
		// N枚のカードに書かれた整数Aiの合計
		int S = sc.nextInt();
		// カードに書かれた整数を格納する配列
		int[] A = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			// カードN枚分入力を受付て配列に格納
			A[i] = sc.nextInt();
		}
		// 全パターンを検索:(1L << N)は 2 の N乗(ただし1Lはlong型の1を表す)
		String answer = "No";
		for (long i = 0; i < (1L << N); i++) {
			int sum = 0;
			for (int j = 1; j <= N; j++) {
				// (i & (1L << (j - 1))) != 0LL の場合、i の 2 進法表記の下から j 桁目が 1
				// (1L << (j - 1)) は Java では「2 の j-1 乗」を意味します
				if ((i & (1L << (j - 1))) != 0L) {
					sum += A[j];
				}
			}
			if (sum == S) {
				answer = "Yes";
				break;
			}
		}
		// 出力
		System.out.println(answer);
	}
}