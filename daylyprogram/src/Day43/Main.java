package Day43;

import java.util.Arrays;
import java.util.Scanner;

//標準偏差

//n 人の学生を含むクラスでプログラミングの試験を行った。
//それぞれの得点をs1, s2 ... snとしたときの、標準偏差を求めるプログラムを作成せよ。
//得点の平均値をｍとすれば、分散α2は以下の式で得られる：
//α2 = (∑ni=1(si - m)2)/n
//分散の正の平方根が標準偏差αとなる。

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 学生の数 n
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				return;
			}
			int sum = 0;
			int score = 0;

			int[] a = new int[n];
			// 標準偏差
			double standardDeviation = 0;

			// データ全体の平均値を出す
			for (int i = 0; i < n; i++) {
				int s = sc.nextInt();
				a[i] = s;
				score += s;
			}
			score = score / n;

			// .偏差（各データから平均値を差し引いた値）を求める
			for (int i = 0; i < n; i++) {
				a[i] = a[i] - score;
				// 算出した偏差を2乗する
				a[i] = a[i] * a[i];
			}
			// 偏差の合計を出す
			int sum2 = Arrays.stream(a).sum();
			// 偏差の合計をデータの総数で割って分散を求める
			sum2 = sum2 / n;

			// 分散の正の平方根を求めて標準偏差を算出する
			standardDeviation = Math.sqrt(sum2);
			System.out.println(standardDeviation);
		}
	}
}