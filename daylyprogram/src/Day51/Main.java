package Day51;

// B - Papers, Please

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Ans = "";
		// 整数Nの数
		int N = sc.nextInt();
		// N個の整数
		for (int i = 0; i < N; i++) {
			int seisu = sc.nextInt();
			if (isEven(seisu) && !isWareru(seisu)) {
				Ans = "DENIED";
				System.out.println(Ans);
				return;
				} else  {
					Ans = "APPROVED";
				}
			}
		System.out.println(Ans);
	}

	// 偶数判定メソッド
	static boolean isEven(int n) {
		return n % 2 == 0;
	}

	static boolean isWareru(int n) {
		if (n % 3 != 0 && n % 5 != 0) {
			return false;
		} else {
			return true;
		}
	}
}