package Day47;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		String Answer = "No";
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		int[] x = new int[5];
		//カードを格納
		int[] number = new int[ 14 ];
		//配列xに数字*5を格納
		for (int i = 0; i < 5; i++) {// ５回
			x[i] = sc.nextInt();			
		}
		
		// for文でループを回して、配列の中の数字と同じものが有ればカウントup
		for (int i = 0; i < 13; i++) {// ５回
			x[i] = sc.nextInt();			
		}
		System.out.println(Answer);
	}
}