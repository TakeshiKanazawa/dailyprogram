package Day59;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int res = 0;
		int A = sc.nextInt();// ¥500
		int B = sc.nextInt();// ¥100
		int C = sc.nextInt();// ¥50

		int X = sc.nextInt();// 合計金額 50の倍数

		for (int a = 0; a <= A; a++) {
			for (int b = 0; b <= B; b++) {
				for (int c = 0; c <= C; c++) {
					int total = 500 * a + 100 * b + 50 * c;
					if (total == X)
						++res;
				}
			}
		}
		System.out.println(res);
	}
}