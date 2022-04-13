package Day12;

import java.util.Scanner;

//約数を全て出力するプログラム

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		for(long i = 1; i * i <= N; i++) {
			if(N % i == 0) {
				System.out.println(i);  // iを約数に追加
				if(i != N / i) {
					System.out.println(N / i);// i ≠ N/i のとき、N/iも約数に追加
				}
			}
		}
	}
	
}