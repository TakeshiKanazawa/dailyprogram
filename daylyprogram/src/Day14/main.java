package Day14;

import java.util.Scanner;

/*■問題
N枚のカードがあり、左からi番目(1<=i<= N)のカードには整数Aiが書かれている
カードを5枚選ぶ方法のうち、選んだカードに書かれた整数の和がちょうど1000となるものは何通りあるか*/
public class main {
	public static void main(String[] args) {
	//入力
		Scanner sc = new Scanner(System.in);
		//N枚のカード
		int N = sc.nextInt();
		//配列の0番目は使用しない為「N + 1」で配列を宣言
		int[] A = new int[N + 1];
		for (int i = 1; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		//5つのカードの番号(i,j,k,l,m)を全探索
		//for文は内側のループから抜けていく。●● <= Nを満たさなくなった場合ループを抜ける
		//上記を利用して全パターンを網羅できる
		int answer = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = i + 1; j <= N; j++) {
				for (int k = j + 1; k <= N; k++) {
					for (int l = k + 1; l <= N; l++) {
						for (int m = l + 1; m <= N; m++) {
							if(A[i] + A[j]+ A[k]+ A[l]+ A[m] == 1000) {
								answer ++;
							}
						}
					}
				}
			}
		}
		System.out.println(answer);
	}
}
