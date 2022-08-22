package Day54;

//英大文字のみからなる文字列 S があります。また、整数 N が与えられます。
//S の各文字を、アルファベット順で N 個後の文字に置き換えた文字列を出力してください。
//ただしアルファベット順で Z の 1 個後の文字は A とみなします。

//■考察
//まずアルファベット全文字を配列に格納
//入力文字列を配列に格納
//アルファベット文字数分ループを回すし、入力文字列から1もじづつ取り出し、
//合致する文字があれば配列に格納。
//その際、Nを足した配列の文字を格納する。
//もし、Nをたした数が26以下でなければ
//26いかになるまで26を引く= ループさせる(while = true)

//出力を行う

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();// 整数N
		String S = sc.next();// 文字列S
		// まずアルファベット全文字を配列に格納
		char[] alphabet = new char[26];
		char c = 'A';
		for (int i = 0; i < 26; i++) {
			alphabet[i] = c++;
		}
		// 入力文字列を配列に格納
		char[] inputArr = new char[S.length()];
		for (int i = 0; i < S.length(); i++) {
			inputArr[i] = S.charAt(i);
		}

		// アルファベット文字数分ループを回すし、入力文字列から1もじづつ取り出し、合致する文字があれば配列に格納。
		for (int i = 0; i < inputArr.length; i++) {
			for (int j = 0; j < alphabet.length; j++) {
				if (inputArr[i] == alphabet[j]) {
					int num = j + N;
					// //もし、Nをたした数が26以下でなければ
					// 26いかになるまで26を
					if (num >= 26) {
						while (num >= 26) {
							num -= 26;
						}
					}
					System.out.print(alphabet[num]);
					break;
				}
			}
		}
	}
}
