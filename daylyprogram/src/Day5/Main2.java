package Day5;

import java.util.Scanner;

class Main2 {
	public static void main(String[] args) {
		/*
		 * 線形時間のプログラム 整数N,X,Yが与えられる。 N以下の正の整数の中でXの倍数またはYの倍数であるものの個数を出力するプログラム
		 */
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();

		int cnt = 0;
		for (int i = 1; i <= N; i++) {
			if (X % i == 0 || Y % i == 0) {
//				cnt+=1;
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}