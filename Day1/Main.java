package practice;

import java.util.Scanner;

//入力値を3つ合計して出力
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numAry[] = new int[3];
		numAry[0] = sc.nextInt();
		numAry[1] = sc.nextInt();
		numAry[2] = sc.nextInt();

		int ans = 0;
		for (int i = 0; i < numAry.length; i++) {
			ans = ans + numAry[i];

		}
		System.out.println(ans);
	}
}