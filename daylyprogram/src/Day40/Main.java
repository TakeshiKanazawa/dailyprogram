package Day40;

import java.util.Scanner;

//シャッフル
/*一つのアルファベットが書かれたn枚のカードの山をシャッフルする
1回のシャッフルでは、下からh枚のカードを纏めて取り出し、それを残ったカードの山の上に積み上げる
カードの山は1つの文字列で与えられる*/

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
		// 最初の並びを表す文字列
		String cards = sc.next();
		// 最初の並びを表す文字列が "-" のとき入力の終わりとsuru
		if ("-".equals(cards)) {
			return;
		}
		// シャッフル回数 m
		int count = sc.nextInt();
		// シャッフルしたカード
		String shuffleCards = "";
			// シャッフル回数分だけループを回す
			for (int i = 0; i < count; i++) {
				// 取り出す(シャッフルする)カード数
				Integer h_shuffle = sc.nextInt();
				// substringで取り出すカード数分取り出し
				String cardsTargetShuffle = cards.toString().substring(0, h_shuffle);
				String cardsTargetShuffle2 = cards.toString().substring(h_shuffle);
				cards = cardsTargetShuffle2 + cardsTargetShuffle;

			}
			System.out.println(cards);
		}
	}
}