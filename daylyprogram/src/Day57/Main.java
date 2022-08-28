package Day57;

//英小文字からなる長さが奇数の文字列 S が与えられます。
//S の中央の文字を出力してください。

//中央の文字とはある長さが奇数の文字列 T について、 T の長さを ∣T∣ として、T の前から  
//2∣T∣+1 番目の文字を中央の文字とします。

//■考察
//取得したい文字列 = 文字数の長さ +1 /2 の文字の場所
// 文字列Sの長さ+1 /2 -1 をchatatで取得
//chatat を使用 index u始まりなので注意

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		int num = S.length() + 1;
		num /= 2;
		num = num -1;
		
		System.out.println(S.charAt(num));
		
	}
}
