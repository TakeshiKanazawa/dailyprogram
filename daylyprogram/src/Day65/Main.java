package Day65;

import java.util.Scanner;

//整数Nが与えられます。
//N以下の整数のうち、桁数が奇数であるようなものの個数を求めてください

//考察
//1の位は奇数、10の位は偶数、100の位は奇数..1000の位は偶数、10000の位は奇数
//制約は1 < N 10の5乗
class Main {
	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int count = 0;
		for (int i = 1; i <= N ; i++) {
			String num =  String.valueOf(i);
			//数字iを文字列に変換し、奇数ならcountをプラス
			if(num.length() % 2 ==1) {
				count++;
			}
		}
		System.out.println(count);
	}
}
