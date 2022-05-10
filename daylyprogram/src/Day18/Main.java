package Day18;

//１つの整数 x を読み込んで、x の３乗を計算し結果を出力するプログラムを作成して下さい。
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//入力として１つの整数 x が与えられます。
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		x *= x * x;
		System.out.println(x);
	}
}