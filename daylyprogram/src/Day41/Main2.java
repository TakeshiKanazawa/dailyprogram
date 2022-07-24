package Day41;

import java.util.Scanner;

//文字列変換

//1.print
//2.reverse
//1.replace
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// １行目に文字列strが与えられる(小文字のみ)
		String str = sc.next();
		// 文字列strを初期値としてビルダーを初期化
		StringBuilder sb = new StringBuilder(str);
		// 2行目に命令の数qが与えられる
		int q_count = sc.nextInt();
		for (int i = 0; i < q_count; i++) {
			// 各命令が与えられる
			String operation = sc.next();
			// print
			if (operation.equals("print")) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				System.out.println(sb.substring(a, b+1));
				
			}
			// reverse
			if (operation.equals("reverse")) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				//対象indexの文字取得
				String rev = sb.substring(a, b+1).toString();
				//ビルダ
				StringBuilder sb2 = new StringBuilder(rev);
				//反転
				String s = sb2.reverse().toString();
				//置き換え
				sb.replace(a,b+1,s);
			}
			// replace
			if (operation.equals("replace")) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				String c = sc.next();
				sb.replace(a,b+1,c);
			}
		}
	}
}