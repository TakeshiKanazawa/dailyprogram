package Day60;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int D = sc.nextInt();

		// 座標を格納する配列
		int X[][] = new int[N][D];

		// N * D回数分ループを回して座標を格納
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < D; j++) {
				X[i][j] = sc.nextInt();
			}
		}

		int ans = 0;

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				int sum = 0;
				for (int k = 0; k < D; k++) {
					// 累乗
					sum += Math.pow(X[i][k] - X[j][k], 2);
				}
				int s = (int)Math.sqrt(sum);
				if (s * s == sum) 	ans++;
			
			}
			System.out.println(ans);
		}

	}
}