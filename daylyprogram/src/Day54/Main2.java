package Day54;

//英大文字のみからなる長さ N の文字列 S があります。
//S の連続する部分列 (入出力例をご覧ください) として ABC がいくつ含まれるかを求めてください。

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 長さN
		String S = sc.next(); // 連続文字列
		
		int i = 0;
		
		//正規表現指定した文字列をPatternクラスのインスタンスにコンパイル
		Pattern p = Pattern.compile("ABC");
		//正規表現エンジンの作成
		Matcher m = p.matcher(S);
		//パターンとマッチする文字列を検索
		while (m.find()) {
		    i++;
		}
		System.out.println(i); 
	}
}
