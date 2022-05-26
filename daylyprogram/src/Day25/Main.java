package Day25;

import java.util.Scanner;

/*長方形の描画
たてH cm よこ W cm の長方形を描くプログラムを作成して下さい。
1 cm × 1cm の長方形を '#'で表します。

■Input
入力は複数のデータセットから構成されています。各データセットの形式は以下のとおりです：
H W
H, W がともに 0 のとき、入力の終わりとします。
■Output
各データセットについて、H × W 個の '#' で描かれた長方形を出力して下さい。
各データセットの後に、１つの空行を入れて下さい。*/

//考察
//二重ループを使う？

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			for (int i = 1; i <= H; i++) {
				for (int p = 1; p <= W; p++) {
					if (p == W) {
						System.out.println("#");
						
					} else {
						System.out.print("#");
					}
				}
			}
			if (H == 0 && W == 0) {
				return;
			}
			System.out.println(""); 
		}
	}
}