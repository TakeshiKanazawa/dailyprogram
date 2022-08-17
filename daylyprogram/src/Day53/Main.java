package Day53;

//1 桁の正整数 a ,b が与えられます。
//整数 a を b 回繰り返してできる文字列と 整数 b を a 回繰り返してできる文字列のうち、辞書順で小さい方を答えてください。

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//変数
		String textA = "";
		String textB = "";
		//入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String str1 = String.valueOf(a);
		String str2 = String.valueOf(b);
		//テキスト生成
		for (int i = 0; i <b; i++) {
			textA += str1;
		}
		for (int i = 0; i <a; i++) {
			textB += str2;
		}
		System.out.println(textA);
		System.out.println(textB);
		//辞書順で比較
		int compare = textA.compareTo(textB);
		if(compare < 0) {
			System.out.println(textA);
		}else {
			System.out.println(textB);
		}
		
		
	}
}