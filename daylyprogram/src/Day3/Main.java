package Day3;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		/*剰余、絶対値、累乗、平方根*/
		//剰余(mod)
		System.out.println(200 % 3);

		//絶対値(abs)
		System.out.println(Math.abs(-200));
		System.out.println(Math.abs(200));
		//累乗(pow)
		System.out.println((int) Math.pow(2.0, 3.0));
		System.out.println((int) Math.pow(3.0, 3.0));
		//平方根(sqrt)
		System.out.println(Math.sqrt(2.0));
		//小数点第５位まで出力
		System.out.format("%.5f\n", Math.sqrt(2.0));
		System.out.format("%.5f\n", Math.sqrt(9.0));
		
		/* ビット演算 */
		Scanner sc = new  Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		
		System.out.println(a & b);  //a and b
		System.out.println(a | b);  //a or b
		System.out.println(a ^ b);  //a xor b
		
	}

}