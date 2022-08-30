package Day58;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		int count = 0;

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		while (true) {
			for (int i = 0; i < N; i++) {
				// 偶数判定
				if (arr[i] % 2 == 0) {
					arr[i] = arr[i]  /= 2;
					if(i ==N-1) {
						count++;
					}
				} else {
					System.out.println(count);
					return;
				}
//				count++;
			}
//			System.out.println(count);
		}
	}
}
