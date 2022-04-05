package Day5;
import java.util.Scanner;

class Main {
	/* 定数時間のサンプルプログラム。
	 * 整数Nが与えられる。2N + 3の値を出力*/
	public static void main(String[] args) {
		//int N = 0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(2 * N + 3);
	}
}