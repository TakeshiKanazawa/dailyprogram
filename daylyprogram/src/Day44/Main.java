package Day44;

import java.util.Scanner;

//ミンコフスキー距離

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// １行目に整数 nが与えられます。
		int n = sc.nextInt();

		double p1 = 0, p2 = 0, p3 = 0, pInfinity = 0;

		// ベクトルxの要素(x座標)
		int[] x = new int[n];
		// ベクトルyの要素(y座標)
		int[] y = new int[n];

		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			y[i] = sc.nextInt();
		}

		// マンハッタン距離(p = 1のとき)
		for (int i = 0; i < n; i++) {
			// 絶対値の合計値
			p1 += Math.abs(x[i] - y[i]);
		}

		// ユークリッド距離(p = 2のとき)
		for (int i = 0; i < n; i++) {
			// 絶対値を2乗した値の合計値
			p2 += Math.pow(Math.abs(x[i])-y[i], 2);
		}
		// 平方根にして格納
		p2 = Math.sqrt(p2);

		// ユークリッド距離(p = 3のとき)
		for (int i = 0; i < n; i++) {
			// 絶対値を3乗した値の合計値
		//	p3 += Math.pow(Math.abs(x[i])-y[i], (double)3);
			p3 += Math.abs((x[i] - y[i]) * (x[i] - y[i]) * (x[i] - y[i]));
		}
		// 立方根にして格納
		p3 = Math.cbrt(p3);
		// チェビシフ距離(p = ∞)
		for (int i = 0; i < n; i++) {
			// 絶対値を3乗した値の合計値
//			pInfinity = Math.max(0, Math.abs(x[i]) - y[i]);
			pInfinity = Math.max(pInfinity, Math.abs(x[i] - y[i]));
		}

		System.out.println(String.format("%.8f", p1));
		System.out.println(String.format("%.8f", p2));
		System.out.println(String.format("%.8f", p3));
		System.out.println(String.format("%.8f", pInfinity));

	}
}