package Day14;

import java.util.Scanner;

/*■問題
N枚のカードがあり、左からi番目(1<=i<= N)のカードには整数Aiが書かれている
カードを5枚選ぶ方法のうち、選んだカードに書かれた整数の和がちょうど1000となるものは何通りあるか*/
public class main {
	public static void main(String[] args) {
	//入力
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N + 1];
		for (int i = 1; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		
		//5つのカードの番号(i,j,k,l,m)を全探索
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
