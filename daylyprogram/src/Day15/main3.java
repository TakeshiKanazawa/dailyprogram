package Day15;

import java.util.Scanner;

/*■問題
 * N枚のカードがあり、左からi番目(1<=i<=N)のカードの色はAiです。
 * Ai = 1のとき赤色、Ai = 2のとき黄色、Ai = 3の時青色です。
 * 同じ色のカードを2枚選ぶ方法は何通りありますか
 * 
 * 制約: 2 <= N <= 500000, 1 <= Ai <= 3
 * 実行制限時間:1秒
 * 
 * ■アルゴリズム
 * ※組み合わせの公式を使う
 * 赤色のカードを2枚選ぶ方法はxC2通り
 * 青色のカードを2枚選ぶ方法はyC2通り
 * 黄色のカードを2枚選ぶ方法はzC2通り
 * → xC2 + yC2 + zC2 = x * (x-1) / 2 + y * (y-1) / 2 + z * (z-1) / 2 
*/

public class main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//入力
		int N = sc.nextInt();
		int[] A = new int[N+1];
		//N枚のカード分だけ入力を受付
		for (int i = 1; i <= N ; i++) A[i] = sc.nextInt();
		
		//答えを求める
		long x = 0,y = 0,z = 0;
		for (int i = 1; i <= N; i++) {
			if(A[i] == 1) x += 1;
			if(A[i] == 2) y += 1;
			if(A[i] == 3) z += 1;
			
		}
		// 出力
		System.out.println(x * (x - 1) / 2 + y * (y - 1) / 2 + z * (z - 1) / 2);
		
	}
}
