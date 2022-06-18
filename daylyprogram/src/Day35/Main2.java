package Day35;

import java.util.Scanner;

//ABC 256
//野球ゲーム

//■考察
//for文で、入力数列の個数分ループを回して条件半手を行いPに加算していく
//正の整数からなる数列A=(A1,A2,A3..N)が与えられる
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();//与えられる数列の個数
		int A = sc.nextInt();//入力数列
		int P = 0;
		int[] num = new int[N];
		for (int i = 0; i < N; i++) {
			int ai = sc.nextInt();// i番目の数
			num[i] = ai;// 配列i番目にaiを格納
		}		
		//Nについて、順番に次の操作を行う。
		for (int i = 0; i < N; i++) {
			int[] num2 = new int[4];
			for (int j = 1; j < 4; j++) {
				if(num2[i] != 0) {
					num2[i]+= num[i];
				}
				if(num2[i] >= 4) {
					P += 1;
				}
			}
		}

		//移動先のマスが存在しない場合(x+Aiが4以上になる)駒達に関しては、
		//それらを取り除いてPに取り除いた個数を加算する
		
		//解答出力
		System.out.println(P);
	}

}