package Day44;

import java.util.Scanner;

//ミンコフスキー距離

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//１行目に整数 nが与えられます。
		int n = sc.nextInt();
		
		double ans1 = 0,ans2 = 0,ans3 = 0,ansInfinity = 0;
		
		//ベクトルxの要素
		int[] x = new int[n];
		//ベクトルyの要素
		int[] y = new int[n];
		
		for (int i = 0; i < n; i++) {
			 x[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			 y[i] = sc.nextInt();
		}
		
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);
		System.out.println(ansInfinity);
	}
}