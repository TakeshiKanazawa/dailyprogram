package Day18;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		//たて a cm よこ b cm の長方形の面積と周の長さを求めるプログラムを作成して下さい。
		//a と b が１つの空白で区切られて与えられます。
		//長方形の面積= a * b
		//周の長さ= 2 * (a + b)
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.print(a*b + " ");
		System.out.print(2 * (a+b) + "\n");
		
		//下記模範コード
//		int S = a * b;
//		int P = 2 * (a+b);
//		System.out.print(S + " " + P);
	}
}