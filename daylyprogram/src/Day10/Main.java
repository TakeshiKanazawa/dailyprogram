package Day10;

import java.util.Scanner;

//素数判定プログラムその①
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		boolean answer = isPrime(N);
		if(answer == true) {
			System.out.println("Its素数");
		}else {
			System.out.println("Its not 素数");
		}
	}
	static boolean isPrime(long N ) {
		//2以上の整数Nに対し、入力値Nが素数であればtrue、素数でなければfalseを返す関数
		//素数=1とその数自信でしか割り切れない数のこと。その為for文の条件はi <= -1となる
		//例えば、N = 4とした場合はN(4) % i(2) == 0となりfalse(素数ではない)となる
		for (long i = 2; i <= N - 1 ; i++) {
			if(N % i == 0) {
				return false;  //Nがiで割り切れた場合、この時点で素数ではないとわかる
			}
		}
		return true;
	}
}