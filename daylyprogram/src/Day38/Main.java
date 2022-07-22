package Day38;

import java.util.Scanner;
//■リング

//■考察
//文字列Aの中に文字列Bが含まれるかを確認したい。
//文字ではなく文字列ということがみそ。
//例えば、Appleの中にpleが含まれているか。
//しかし、実際には時計回りになっているのでppleaになっていたりする。
//なので、pplea+ppleaを結合すると、「ppleapplea」となり、indexofで[apple]＝trueとなる

//indexofで比較

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Ans = "Yes";//出力値初期化
		
		//■Input
		// １行目に文字列 sが与えられます。
		String line_s = sc.next();
		// 2行目に文字列  pが与えられます。
		String line_p = sc.next();
		//文字列の連結
		String connect = line_s.concat(line_s);
		if(connect.indexOf(line_p) == -1 ) {
			Ans = "No";
		}
		System.out.println(Ans);
	}
}