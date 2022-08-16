package Day52;

//B - I miss you...

// 文字列 S が与えられます。S のすべての文字を x で置き換えて出力してください。

// Sは英小文字のみからなる文字列
// Sの長さは1以上100以下

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();

//		String text = "";
//		for (int i = 0; i < S.length(); i++) {
//			text += "x";
//		}
//		System.out.println(text);
//	}
		System.out.println(S.replaceAll(".", "x"));
	}
}