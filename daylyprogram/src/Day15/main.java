package Day15;

import java.util.Scanner;

/*■問題
 1<= r <= n <= 20を満たす整数n,rが与えられます。
 nCrを出力するプログラムを作成してください
*/

public class main {
	public static void main(String[] args) {
		//入力
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		//階乗の計算
		long fact_n = 1;	//n!の値
		long fact_r = 1;	//r!の値
		long fact_nr = 1;	//(n-r)!の値
		for(int i = 1; i <= n; i++) fact_n *= i;
		for(int i = 1; i <= r; i++) fact_r *= i;
		for(int i = 1; i <= n - r; i++) fact_nr *= i;
		
		//出力
		System.out.println(fact_n / (fact_r) * fact_nr);
	}
}
