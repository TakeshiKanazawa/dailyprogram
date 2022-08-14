package Day50;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1 行目にログの行数を示す整数 N が入力が与えられます。
		int N = sc.nextInt();
		
		//何階文動いたか
		int count =  0;
		int tmp = 1;
		for (int i = 0; i < N; i++) {
			int n = sc.nextInt();
			int c = n - tmp; 
			tmp = n;
			
			count += Math.abs(c);
		}
		System.out.println(count);
	}
		
}