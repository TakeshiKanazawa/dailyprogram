package Day67;

import java.util.Scanner;

//整数Nが与えられます。
//ここで、2 つの正の整数 A,B に対して、F(A,B) を「10 進表記における、A の桁数と B の桁数のうち大きい方」と定義します。
//例えば、F(3,11) の値は、3 は 1 桁、11 は 2 桁であるため、F(3,11)=2 となります。
//2 つの正の整数の組 (A,B) が N=A×B を満たすように動くとき、F(A,B) の最小値を求めてください。

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		int min = Integer.MAX_VALUE;
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				int digit = (int) Math.log10(n / i) + 1;
				min = Math.min(min, digit);
			}
		}
		System.out.println(min);
	}
}
