package Day15;

import java.util.Scanner;

/*■問題
コンビニにはN個の品物が売られており、i番目(1 <= i <= N)の商品の値段はAi円です。
異なる２つの品物を買う方法のうち、合計値段が500円となるものは何通りあるか

制約: 2<= N 200000, Aiは100,200,300,400のいずれか
実行制限時間:1秒
*/

public class main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//入力(N個の品物)
		int N = sc.nextInt();
		int[] A = new int[N + 1];
		//品物の数だけ入力を受け付ける
		for (int i = 1; i <= N; i++) A[i] = sc.nextInt();
		//答えを求める
		//合計値段が500円となるのは①100 + 400か②200 + 300の ２つ
		//積の法則から、この2パタンを計算し、合算する
		long a = 0,b = 0,c = 0,d = 0;
		for(int i = 1; i <= N; i++) {
			if(A[i] == 100) a += 1;
			if(A[i] == 200) b += 1;
			if(A[i] == 300) c += 1;
			if(A[i] == 400) d += 1;
		}
		System.out.println(a * d + c * d);
	}
}
