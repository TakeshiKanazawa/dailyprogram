package Day27;

import java.util.Scanner;

//１つの整数 nが１行に与えられます。
//nが10余り3、もしくは3の約数であった場合、出力を行う
public class Main2 {
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		int n = SC.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || String.valueOf(i).contains("3")) {
				System.out.print(" " + i);
			}
		}
		System.out.println("");
	}
}