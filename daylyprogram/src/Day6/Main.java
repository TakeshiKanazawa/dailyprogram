package Day6;

import java.util.Scanner;
class Main {
	/* 全探索の計算回数
	 * 青、赤、各1枚の合計2枚のカードがあり、それぞれのカードに1以上N以下の整数を一つ書き込む。
	 * カードに書かれた整数の合計がS以下とないような書き方がいくつあるか出力するプログラム
	 */
	public static void main(String[] args) {
		//入力
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = sc.nextInt();
		
		int cnt = 0;
		//青のカード
		for (int i = 1; i <= N; i++) {
			//赤のカード
			for(int j = 1; j <= N; j++) {
				//青、赤の合計がS以下であった場合
				if(i + j <= S) {
					//変数cntをカウントアップ
					cnt++;
				}
			}	
		}
	}
}