package Day27;

import java.util.Scanner;

//以下のような、たてH cm よこ W cm のチェック柄の長方形を描くプログラムを作成して下さい。
//上図は、たて 6 cm よこ 10 cm の長方形を表しています。
//長方形の左上が "#" となるように描いて下さい。
//■Input
//入力は複数のデータセットから構成されています。各データセットの形式は以下のとおりです：
//H W
//H, W がともに 0 のとき、入力の終わりとします。
//■Output
//各データセットについて、たて H cm よこ W cm の枠を出力して下さい。
//各データセットの後に、１つの空行を入れて下さい。

//考察
//①Hが奇数のとき、かつWが奇数の時に「#」を出力
//②Hが偶数の時、かつ Wが偶数の時に「#」を出力
//③Hが奇数の時、かつWが偶数の時に「.」を出力
//④Hが偶数の時、かつ Wが奇数の時に「.」を出力

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			for (int i = 1; i <= H; i++) {
				for (int p = 1; p <= W; p++) {
					if ((i % 2 != 0) && (p % 2 != 0) || (i % 2 == 0) && (p % 2 == 0)) {
						System.out.print("#");
					} else if ((i % 2 != 0) && (p % 2 == 0) || (i % 2 == 0) && (p % 2 != 0)) {
						System.out.print(".");
					}
				}
				System.out.println("");
			}
			if (H == 0 && W == 0) {
				return;
			}
			System.out.println("");
		}

	}
}