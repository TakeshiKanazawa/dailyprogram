package Day2;

import java.util.Scanner;

//10進数を2進数に変換するプログラム
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String answer = "";
		while (N >= 1) {
			//N1 % 2は Nを 2で割った余り
			//N  / 2は Nを 2で割った値の整数部分(例:N = 13の 場合 6)
			if (N % 2 == 0) {
				answer = "0" + answer;
			}
			if (N % 2 == 1) {
				answer = "1" + answer;
			}
			//入力値を2で割ってループを戻す
			N = N / 2;
		}
		System.out.print(answer);
	}
}