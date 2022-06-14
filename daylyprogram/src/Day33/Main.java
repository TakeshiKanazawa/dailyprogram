package Day33;

import java.util.Scanner;

//大文字と小文字の入れ替え
//与えられた文字列の小文字と大文字を入れ替えるプログラムを作成してください。
//■Input
//文字列が1行に与えられます。
//■Output
//与えられた文字列の小文字と大文字を入れ替えた文字列を出力して下さい。アルファベット以外の文字はそのまま出力して下さい。
//Constraints
//入力される文字列の長さ < 1200

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		for (int i = 0; i < text.length(); i++) {// 文字列の長さ分繰り返す
			char ch = text.charAt(i);
			if (Character.isAlphabetic(ch)) {//アルファベットの場合
				if (Character.isLowerCase(ch))
					System.out.print(Character.toUpperCase(ch));//小文字→大文字
				if (Character.isUpperCase(ch))
					System.out.print(Character.toLowerCase(ch));//大文字→小文字
			} else {
				System.out.print(ch);//アルファベット以外
			}
		}
		System.out.println();
	}
}