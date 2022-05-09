package Day17;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力
		int H = sc.nextInt();
		int W = sc.nextInt();

		int R = sc.nextInt();
		int C = sc.nextInt();

		int answer = 0;

			if (R - 1 != 0) {
				answer += 1;
			}
			if (R + 1 <= H) {
				answer += 1;
			}
				if (C - 1 != 0) {
					answer += 1;
				}
				if (C + 1 <= W) {
					answer += 1;
				}

		System.out.println(answer);
	}
}