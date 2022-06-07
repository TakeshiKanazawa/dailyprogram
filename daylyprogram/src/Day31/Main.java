package Day31;

import java.util.Scanner;
//組み合わせの数
//1 から n までの数の中から、重複無しで３つの数を選びそれらの合計が x となる組み合わせの数を求めるプログラムを作成して下さい。
//例えば、1 から 5 までの数から３つを選んでそれらの合計が 9 となる組み合わせは、
//
//1 + 3 + 5 = 9
//2 + 3 + 4 = 9
//の２通りがあります。

//■Input
//複数のデータセットが入力として与えられます。各データセットでは、空白で区切られた n、x が 1 行に与えられます。
//n、x がともに 0 のとき入力の終わりとします。
//■Constraints
//3 ≤ n ≤ 100
//0 ≤ x ≤ 300
//■Output
//各データセットについて、組み合わせの数を１行に出力して下さい。
//■考察
//num1 >= n && num2 >= n num3 >= n 
//num1 + num2 + num3 = x となるパターンをループで加算する
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();// 1からnの数
			int x = sc.nextInt();// 合計の数
			int answer = 0;
			for (int i = 1; i <= n; i++) {
				for (int j = i+1; j <= n; j++) {
					for (int k = j+1; k <= n; k++) {
						if(i + j + k == x) {
							answer ++;
						}
					}
				}
			}
			if(n == 0 && x == 0) {
				return;
			}
			System.out.println(answer);
		}
	}
}