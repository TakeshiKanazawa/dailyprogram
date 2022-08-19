package Day53;

//1 桁の正整数 a ,b が与えられます。
//整数 a を b 回繰り返してできる文字列と 整数 b を a 回繰り返してできる文字列のうち、辞書順で小さい方を答えてください。

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	// 英小文字のみからなる長さ N の文字列 S, T が与えられます。
	// S の 1 文字目、T の 1 文字目、S の 2 文字目、T の2 文字目、S の 3 文字目、...、S のN 文字目、T のN 文字目というように、 
		//S の各文字と T の各文字を先頭から順に交互に文字を並べ、新しい文字列を作ります。この新しくできた文字列を出力してください

		String mixedText = "";
		
		// 長さ N
		int N = sc.nextInt();
		// 文字列 S
		String S = sc.next();
		// 文字列 T
		String T = sc.next();

		// 文字列からchar型で1文字を取得する
		for (int i = 0; i < N; i++) {
			mixedText += S.charAt(i);
			mixedText += T.charAt(i);
		}
		System.out.println(mixedText);
	}
}