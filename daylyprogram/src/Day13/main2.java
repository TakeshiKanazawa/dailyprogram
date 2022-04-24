package Day13;

import java.util.Scanner;

public class main2 {

	/*
	 * ユークリッドの互除法を用いて、N個の整数 A1,A2,A3..の
	 *  最大公約数を計算するプログラム
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//標準入力
		int inputNumber = sc.nextInt();
		long[] inputArray = new long[inputNumber + 1];
		for(int i = 1; i <= inputNumber; i++) {
			inputArray[i] = sc.nextLong();
		}
		
		//最大公約数を求める
		long R = GCD(inputArray[1],inputArray[2]);
		for (int i = 3; i < inputArray.length; i++) {
			R = GCD(R,inputArray[i]);
		}
		
		System.out.println(R);
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
