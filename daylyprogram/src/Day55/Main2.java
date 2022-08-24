package Day55;

//たこフェスでふるまわれる N 個のたこやきから、2 個を選んで一緒に食べたときの体力の回復量の総和を出力せよ。

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数 N
		int N = sc.nextInt();
		//配列にdiの値を格納する
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			for (int j = 1; j < N; j++) {
				if(i == j) {
					break;
				}
				sum += arr[i]* arr[j];
			}
		}
		System.out.println(sum);
	}
}
