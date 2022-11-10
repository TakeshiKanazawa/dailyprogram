package Day68;

import java.util.Scanner;

//英小文字からなる文字列 S が与えられます。
//S に a が現れるならば最後に現れるのが何文字目かを出力し、現れないならば −1 を出力してください。

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		if(S.contains("a")) {
			System.out.println(S.lastIndexOf("a")+1);
		}
		else {
			System.out.println(-1);
		}
	}
}
