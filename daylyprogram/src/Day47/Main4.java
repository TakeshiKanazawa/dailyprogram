package Day47;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		
		String text = "+";
		String decorationTexts = "";
		
		for (int i = 0; i < s.length()+2; i++) {
			decorationTexts = decorationTexts.concat(text);
		}
		System.out.println(decorationTexts);
		System.out.println(text + s + text);
		System.out.println(decorationTexts);
	}
}
