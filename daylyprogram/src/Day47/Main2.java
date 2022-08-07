package Day47;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ABC 081 B - Shift only

		int count = sc.nextInt();
		// 配列にAi の数字を格納
		int[] array = new int[count];
		for (int i = 0; i < count; i++) {
			array[i] = sc.nextInt();
		}

		int operationCount = 0;// 操作回数
		boolean flg = true; // フラグ

		while (flg) {
			for (int i = 0; i < count; i++) {
				if (judgeEvenNumber(array[i])) {
					flg = true;
				} else {
					flg = false;
					break;
				}
			}

			for (int i = 0; i < count; i++) {
				if (flg) {
					array[i] /= 2;
				}else {
					System.out.println(operationCount);
					return;
				}
			}
			operationCount++;

		}

	}

	// 偶数判定メソッド
	static boolean judgeEvenNumber(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
