package Day55;

//高橋君は九九を覚えたので、1 以上 9 以下の 2 つの整数の積を計算することができます。
//
//整数 N が与えられるので、N を 1 以上 9 以下の 2 つの整数の積として表すことができるか判定し、
//できるなら Yes を、できないなら No を出力して下さい。

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数 N
		int N = sc.nextInt();
		// N を 1 以上 9 以下の 2 つの整数の積として表すことができるなら Yes を、できないなら No を出力
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if(i * j == N) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}
