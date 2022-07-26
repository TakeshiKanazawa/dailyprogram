package Day42;

import java.util.Scanner;

//2点間の距離

//■考察
//ピタゴラスの定理を使用する

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 三角形の２辺 a, b とその間の角 C から、
		// その三角形の面積 S、周の長さ L, a を底辺としたときの高さ h を求めるプログラム
		
		//面積
		// 底辺 * 高さ / 2
		double S,L,h;
		
		// a の長さ, b の長さ, Cの大きさ（度）（整数）が空白区切りで与えられます。
		int a = sc.nextInt();
		int b = sc.nextInt();
		int C = sc.nextInt();
		
		//度をラジアンに変換
		int deg;
		double rad;
		double PI = Math.acos(-1);
		deg = C;
		rad = deg * PI / 180;
		
		//面積
		S = 0.5*a*b*Math.sin(rad);
		// 高さ
		h = 2*S/a;
		// 余弦定理からa**2
		double c = Math.sqrt(a*a+b*b-2*a*b*Math.cos(rad));
		//周の長さ
		L = a + b + c;
		// S, L, h をそれぞれ1行に出力して下さい。0.0001以下の誤差があってもよいものとします。
		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
		
	}
}