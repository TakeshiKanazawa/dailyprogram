package Day59;

import java.util.Scanner;

//ABC 洋菓子店では, 1 個 4 ドルのケーキと 1 個 7 ドルのドーナツが売られている.
//このとき, 合計金額が N ドルとなる買い方はあるか, 判定せよ. 
//ただし, 同じ商品を二個以上買っても良く, 買わない商品があっても良いものとする.

//ケーキとドーナツ合計でN円ということは、ケーキの個数は0個以上 N/4個以下、
//ドーナツの個数はN/7個以下である
//この個数の範囲で、ケーキの個数A ドーナツの個数Bを全探索する
// 4A + 7B = N = "Yes"を出力
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int N = sc.nextInt();// 合計金額
		while (total < N) {
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					 total = i * 4 + j * 7;
					if (total == N) {
						System.out.println("Yes");
						return;
					}
				}
			}
		}
		System.out.println("No");
	}
}