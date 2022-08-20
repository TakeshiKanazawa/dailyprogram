package Day54;

//英大文字のみからなる文字列 S があります。また、整数 N が与えられます。
//S の各文字を、アルファベット順で N 個後の文字に置き換えた文字列を出力してください。
//ただしアルファベット順で Z の 1 個後の文字は A とみなします。

//■考察
//入力文字列分のchar型の配列を作成
//まず文字列を先頭から1もじずつ取得しchar型に変換して格納
//与えられた整数Nの部分だけ数字を加算する

//出力を行う

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String S = sc.next();
		//入力文字列分のchar型の配列を作成
	    
	    char []alphabet = new char[26];
	    char c = 'a';
	    for (int i = 0; i < 26; i++){
	        alphabet[i] = c++;
	        System.out.println(alphabet[i+N]);
	    }
	    
	    for (int i = 0; i < S.length(); i++){
	        System.out.println(alphabet[i]);
	    }
	  }
	}