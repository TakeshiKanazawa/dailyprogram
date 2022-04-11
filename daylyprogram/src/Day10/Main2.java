package Day10;

import java.util.Scanner;

//素数判定プログラムその②(高度な素数判定)
class Main2 {
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
		
		static boolean isPrime(long N) {
			//2以上の整数Nに対し、Nが素数であればtrue、素数でなければfalseを返す
			for (long i = 2; i * i <= N ; i++) {
				if(N % i == 0) {
					return false;
				}
			}
		return true;
	}
}