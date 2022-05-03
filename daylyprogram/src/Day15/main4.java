package Day15;

import java.util.Scanner;

/*■問題
 * N枚のカードがあり、左からi番目のカードには整数Aiが書かれている
 * 和が100000となる2枚のカードの選び方は何通りあるかを求めるプログラムを作成してください
 * ※2<=N<=200000, 1<= Ai <= 99999 を満たすケースで1秒以内で
 * 実行が終わる事が望ましい
*/

public class main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int N = sc.nextInt();
		int[] A = new int[N + 1];
		//N枚のカード分、整数Aiの入力
		for (int i = 1; i <= N; i++) A[i] = sc.nextInt();
		
		// 答えを求める
		long[] cnt = new long[100009];
		for (int i = 1; i <= 99999; i++) cnt[i] = 0;
		for (int i = 1; i <= N; i++) cnt[A[i]] += 1;
		
		long Answer = 0;
		for (int i = 1; i <= 49999; i++) Answer += cnt[i] * cnt[100000 - i];
		Answer += cnt[50000] * (cnt[50000] - 1) / 2;
		
		// 出力
		System.out.println(Answer);
		
	}
}
