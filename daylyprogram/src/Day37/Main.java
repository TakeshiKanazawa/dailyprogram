package Day37;

import java.util.Scanner;

//与えられた文字列の列に含まれる、
//各アルファベットの数を数えるプログラムを作成して下さい。 なお、小文字と大文字は区別しません。

//■Input
//複数の文字列が与えられます。入力は複数行で与えられる場合があります。
//■Output
//入力に含まれる各アルファベットの数を以下に示す形式で出力して下さい：
//■制約
//文字列が含む文字の数 < 1200
//文字列は英小文字、英大文字、数字、記号からなる
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//サイズが 26 である整数型の配列を宣言(アルファベットA-Zを数字にすると25)
		int[] counter = new int[26];
		
		while(sc.hasNext()) { //入力が存在する間
			String str = sc.next().toLowerCase();// 入力文字を小文字に変換して格納
			for (int i = 0; i < str.length(); i++) {
				int num = str.charAt(i) - 'a'; // 文字列line のi番目の文字を番号(数字)に変換
				if(num > 26 || num < 0) {//変換した文字の数字がアルファベットじゃない場合(1-25以外の数字)
					//ループ処理を戻す(何もしない)
					continue;
				}
				//該当のアルファベットの配列カウンタを加算
				counter[num]++;
			}
		}
		for (int i = 0; i < counter.length; i++) {
			//int型のiをcharに変換してアルファベット出力させたい
			char res = (char) ('a' + i);
			System.out.println(res + " : " + counter[i]);
		}
	}
}