package Day48;

import java.util.Scanner;

//カラオケの得点計算プログラム

// 最高得点を出力する
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxScore = 0; // 最大スコア

		// 1 行目に歌う人数を表す整数 N と課題曲の長さを表す整数 M が与えられます。
		int[] nmArray = new int[2];
		for (int i = 0; i < nmArray.length; i++) {
			nmArray[i] = sc.nextInt();
		}
		// 歌い手の人数
		int singerCount = nmArray[0];
		// 課題曲の長さ(小節数)
		int measureCount = nmArray[1];

		// 小節ごとの正しい音程(HZ)を格納
		int[] HZArray = new int[measureCount];
		for (int i = 0; i < measureCount; i++) {
			HZArray[i] = sc.nextInt();
		}

		// 歌手の小節ごとの音程
		int[][] scoreArray = new int[singerCount][measureCount];
		int score = 100;

		for (int i = 0; i < singerCount; i++) {
			for (int j = 0; j < measureCount; j++) {
				scoreArray[i][j] = sc.nextInt();
				scoreArray[i][j] -= HZArray[j];
				if ((scoreArray[i][j] > 0 && scoreArray[i][j] <= 5)
						|| (scoreArray[i][j] < 0 && scoreArray[i][j] <= -5)) {
					// 何もしない
				}
				if ((scoreArray[i][j] > 0 && scoreArray[i][j] <= 10)
						|| (scoreArray[i][j] < 0 && scoreArray[i][j] >= -10)) {
					score -= 1;
					continue;
				} else if ((scoreArray[i][j] > 0 && scoreArray[i][j] <= 20)
						|| (scoreArray[i][j] < 0 && scoreArray[i][j] >= -20)) {
					score -= 2;
					continue;
				} else if ((scoreArray[i][j] > 0 && scoreArray[i][j] <= 30)
						|| (scoreArray[i][j] < 0 && scoreArray[i][j] >= -30)) {
					score -= 3;
					continue;
				} else if ((scoreArray[i][j] > 0 && scoreArray[i][j] >= 31)
						|| (scoreArray[i][j] < 0 && scoreArray[i][j] <= -31)) {
					score -= 5;
				}
			}
			// 最大スコアと比較して、大きい方を最大スコアとする
			if (score > maxScore)
			{
				maxScore = score;
			}
		}



// 解答出力
		System.out.println(maxScore);
	}
}