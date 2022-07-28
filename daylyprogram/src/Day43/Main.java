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

		// 学生の数 n を入力
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				return;
			}
			double score = 0;
			double averageScore = 0;
			double[] a = new double[n];
			// 標準偏差
			double standardDeviation = 0;

			// データ全体の平均値を出す
			for (int i = 0; i < n; i++) {
				double s = sc.nextDouble();
				a[i] = s;
				//合計スコアに加算
				score += s;
			}
			//合計スコアを人数で除算し平均値を求めて変数に代入
			averageScore = score / n;

			// .偏差（各データから平均値を差し引いた値）を求める
			for (int i = 0; i < n; i++) {
				a[i] = a[i] - averageScore;
				// 算出した偏差を2乗する
				a[i] = a[i] * a[i];
			}
			// 偏差の合計を出す
			double sumstandardDeviation = Arrays.stream(a).sum();
			// 偏差の合計をデータの総数で割って分散を求める
			double dispersion = (double)sumstandardDeviation / n;
			// 分散の正の平方根を求めて標準偏差を算出する
			standardDeviation = Math.sqrt(dispersion);
//			System.out.println(standardDeviation);
			System.out.println(String.format("%.8f", standardDeviation));
		}
	}
}