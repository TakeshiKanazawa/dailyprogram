package Day62;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		// N以下の2で割れる最大数。初期値は1
		int max = 1;
		int cnt = 0;

		//ループ変数iは初期値1にする
		for (int i = 1; i < N; i++) {
			int tmp = i;
			int tmpCnt = 0;
			while (true) {
				tmp = tmp / 2;
				if (tmp == 0) {
					//whileループを抜けて26行目に処理を移動
					break;
				}
				tmpCnt++;
			}
			if (tmpCnt > cnt) {
				cnt = tmpCnt;
				max = i;
			}
		}
		System.out.println(max);
	}
}