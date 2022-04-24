package Day13;

import java.util.Scanner;

public class main {

	//ユークリッドの互除法(2つの自然数の最大公約数を求める)
	/*
	 * ユークリッドの互除法とは、２つの自然数のうち大きい値をもう一つの自然数で割っていき 
	 * 剰余が0になった時の除数が２つの自然数の最大公約数となるアルゴリズム
	 */
	public static void main(String[] args) {
		//標準入力
		Scanner sc = new Scanner(System.in);
		//標準入力待ち受け
		long naturalNumberA = sc.nextLong();
		long naturalNumberB = sc.nextLong();
		System.out.println(GCD(naturalNumberA,naturalNumberB));
		sc.close();

	}
	static long GCD(long A, long B) {
		//正の整数A と B　の最大公約数を返す関数
		//GCDは　Greatest Common Divisir(最大公約数)の略
		while(A >= 1 && B >= 1) {
			if (A < B) {
				//%=は複合代入演算子、BをAで割った余りをBに代入
				B %= A;  // A < Bの場合、大きい方　B を書き換える
			}else {
				A %= B;  // A >= Bの場合、大きい方　A を書き換える
			}
		}
		//AかBの入力値、どちらかでも0になったらループを抜ける
		//AかB、除数(0では無い方)の数字を返却する(最大公約数)
		if(A >= 1) {
			return A;
		}
		return B; 
	}
}
