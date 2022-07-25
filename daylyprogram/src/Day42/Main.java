package Day42;

import java.util.Scanner;

//2点間の距離

//■考察
//ピタゴラスの定理を使用する

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double Answer = 0.0;
		// ２点 P1(x1, y1), P2(x2, y2) の距離を求めるプログラムを作成せよ。
		
		Double x1 = sc.nextDouble();
		Double y1 = sc.nextDouble();
		Double x2 = sc.nextDouble();
		Double y2 = sc.nextDouble();
		
		//ピタゴラスの定理を使用
		//x1,y1とx2,y2の2点の距離を求める
		//XY = √((x2-x1)2乗 + (y2-y1)2乗))
		Double x = x2 - x1;
		Double y = y2 - y1;
		Answer = Math.sqrt((x*x) + (y*y));
		//P1とP2の距離を実数で１行に出力	(0.0001以下の誤差は許容)
		System.out.println(Answer);
	}
}