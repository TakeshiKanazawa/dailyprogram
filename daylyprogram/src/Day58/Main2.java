package Day58;

//a と b の積が偶数か奇数か判定してください

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if((a * b)%2 ==0 ) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
}
