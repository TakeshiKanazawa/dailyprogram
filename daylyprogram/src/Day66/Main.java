package Day66;

import java.util.Scanner;

//正整数A,Bが与えられます
//AもBも割り切る正整数のうち、K番目に大きいものを求めてください
//なお、与えられる入力では、AもBも割り切る正整数のうちK番目に大きいものが保証されます

//1<=A,B<=100
class Main {
	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		//入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		
		int cnt = 0;
		
		for (int i = 100; i > 0; i--) {
			//AもBも割り切る整数
			if(A%i==0&&B%i==0) {
				cnt++;
			}if(cnt==K) {
				System.out.println(i);
				break;
			}	
		}
	}
}
