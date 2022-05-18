package Day22;

import java.util.Scanner;
/*約数の数
３つの整数 a、b、c を読み込み、a から b までの整数の中に、c の約数がいくつあるかを求めるプログラムを作成してください。
ちなみに約数とは、ある数AがBで割り切れるときのBのこと。
Input
a、b、c が１つの空白区切りで１行に与えられます。
Output
約数の数を１行に出力してください。
Constraints
1≤a,b,c≤10000
a≤b
*/

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		//aからbまでの整数
		int num= 0;
		while (a <= b) {
			if(c % a == 0) {
				num +=1;
			}
			a +=1;
		}

		System.out.println(num);
	}
}