package Day57;

//N−x は 998244353 の倍数
//xを求める
// 998244353 の倍数かを求める
// ある数の倍数であるかを求めるPGを作る

//ループを回してxをカウントupしていく

// その中で　N-xの数字が 倍数判定なら出力する(答えは一つ)
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long min = 998244353;
		long in = sc.nextLong();
		
		long res = in % min;
		if(in < 0 && res != 0)
		{
			 res = min - Math.abs(res);
		}
		System.out.println(res);
	}
}