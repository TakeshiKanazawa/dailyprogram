package Day39;

import java.util.Scanner;
//１つの単語 W と文章 T が与えられます。T の中にある W の数を出力するプログラムを作成して下さい。
// 文章Tに含まれるスペースまたは改行で区切られた文字列を単語Tiとする。
// 全てのTiにおいて単語Wと同じになるものを数える
//※大文字と小文字は区別しない

// ■課題
//単語Tiの取得

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer Ans = 0;// 出力値初期化
		// 1行目に単語 Wが与えられる
		String word_W = sc.next();

		// 続いて複数の行にまたがった文章与えられる
		// END_OF_TEXT という文字列が文章の終わりを示す
		while (sc.hasNext()) {
			// 文章Tの取得
			String text_T_Word = sc.next();
			String text_T_Word_Low = text_T_Word.toLowerCase();			
			// ロジック①
			if (text_T_Word_Low.equals(word_W)) { //
				Ans++;
			}
//			ロジック②
			if (text_T_Word.equals("END_OF_TEXT")) { //
				System.out.println(Ans);
				return;
			}
		}
	}
}