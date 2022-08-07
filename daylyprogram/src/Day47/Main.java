package Day47;

import java.util.Scanner;

// Full House

// 5つの数A B C D E　が与えられる
// フルハウスかどうかを判定する。判定の条件は同じ組が書かれたカード3枚と、別の同じ組が書かれたカードが存在するか
// フルハウスである場合 Yes を、そうでないとき No を出力

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] card = new int[5]; // カードを格納する配列
		// 配列xに数字*5を格納
		for (int i = 0; i < 5; i++) {// ５回
			card[i] = sc.nextInt();
		}

		int[] countArray = new int[5]; // カウント用の配列

		// for文でループを回して、配列の中のカードを全探索し、同じものが有ればカウントup
		//
		for (int i = 0; i < card.length; i++) {// ５回
			if (card[0] == card[i]) {
				countArray[0]++;
			}
			if (card[1] == card[i]) {
				countArray[1]++;
			}
			if (card[2] == card[i]) {
				countArray[2]++;
			}
			if (card[3] == card[i]) {
				countArray[3]++;
			}
			if (card[4] == card[i]) {
				countArray[4]++;
			}
		}
		// 配列の数字を全てカウントする
		int sum = 0;
		for (int i : countArray) {
			sum += i;
		}
		if (sum == 13) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
