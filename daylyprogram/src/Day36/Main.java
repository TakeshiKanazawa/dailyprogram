package Day36;

import java.util.Scanner;

// 与えられた数の各桁の和を計算するプログラムを作成して下さい。

//複数のデータセットが入力として与えられます。各データセットは１つの整数 x を含む１行で与えられます。
//x は 1000 桁以下の整数です。
//x が 0 のとき入力の終わりとします。このデータセットに対する出力を行ってはいけません。

public class Main {
	public static void main(String[] args) {
		String x;
		Scanner sc = new Scanner(System.in);
		while (true) {
			x = sc.next();
			if (x.equals("0"))
				break;
			int sum = 0;
			for (int i = 0; i < x.length(); i++)
				sum += x.charAt(i) - '0';
			System.out.println(sum);
		}
	}
}