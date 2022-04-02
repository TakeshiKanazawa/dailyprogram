package Day3;
import java.util.Scanner;

class Main2 {
	public static void main(String[] args) {
		/* N個の整数a1,a2,a3,anが与えられる。(条件) aN mod 100 の値を出力するプログラム */
		
		//入力
		Scanner sc = new Scanner(System.in);
		//標準入力の受付
		int N = sc.nextInt();
		//入力値(N)の数を格納できる配列を作成
		int[] A = new int[N + 1]; 
		for (int i = 0; i < N; i++) {
		//N回分、整数の入力を受付マッスル
			A[i] = sc.nextInt();
		}	
		//Answer
		int Answer = 0;
		for (int i = 1; i < N; i++) {
			//AnswerにN個の整数が格納された配列Aの中身を全て加算したものを格納
			Answer  += A[i];
		}
//		入力値全ての加算 mod 100
		System.out.println(Answer % 100);
	}
}