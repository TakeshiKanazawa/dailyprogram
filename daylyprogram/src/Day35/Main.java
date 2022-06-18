package Day35;

import java.util.Scanner;

//ABC 256
//N が与えられます。2Nを出力してください。
//■考察→入力されたNの数だけ、2の階乗をけいさんすればよいだけ。
//例:N=3なら2 * 2 * 2
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();//入力値
		int ans = 1;
		
		for (int i = 0; i < N; i++) {
			ans *= 2;
		}
		System.out.println(ans);
	}
}