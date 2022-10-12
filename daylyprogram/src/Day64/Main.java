package Day64;

import java.util.Scanner;

//長さNの整数列Aが与えられます。Aの(添字の)異なる
//差の絶対値の最大値を求めてください

//■考察
//入力された数字を、最大のものとさいしょうのものを変数に格納して
//ループを回した後に、最大値-最小値を出力するだけ
//N回分ループを回して、入力された数字Aiが、制約の2以上または変数maxより上なら変数maxに格納、
//1以下もしくは変数lowよりしたなら変数roｗに格納

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		int max = 0;
		int row = 0;
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			//1回目のループの場合
			if(i==0) {
				row = arr[i];
				max = arr[i];
			}
			if(max<arr[i]) {
				max = arr[i];
			}
			if(row>arr[i]) {
				row = arr[i];
			}
		}
		System.out.println(max-row);
		
	}
}
