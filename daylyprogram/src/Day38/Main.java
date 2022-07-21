package Day38;

import java.util.Scanner;
//■リング

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Ans = "";//出力値初期化
		//■Input
		// １行目に文字列 sが与えられます。
		String line_s = sc.next();
		// 2行目に文字列  pが与えられます。
		String line_p = sc.next();
		//■Output
		//pが作れる場合は Yes と、作れない場合は No と１行に出力してください。
		for (int i = 0; i < line_p.length(); i++) {
			String s = line_p;
			
		}
		if ( line_s.indexOf(line_p) == -1 ) {
			System.out.println("No");
		}
		else System.out.println("Yes");
	}
}