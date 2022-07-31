package Day45;

import java.util.Scanner;

//サイコロのクラス
class Dice {
	double[] s;
	
	// コンストラクタ
	public Dice(double[] s) {
		this.s = s;
	}
	
	// サイコロを転がす(N方向)
	void move() {
		double tmp = this.s[0];
		this.s[0] = this.s[1];
	}
	
	// サイコロの上面の数を出力
	void print() {
		
	}
	
}

//サイコロ I
//■考察
// 求めたいのは頂点(上面)の数
//サイコロをn方向に動かした時点の数を都度保持しておき、最終的に出力させれば解くことは可能
//例えば[1]が頂点のとき、Wがにゅうりょくされたら4 Eなら3など

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// １行目に各面の整数が、図に示すラベルの順番に空白区切りで与えられます。
		
		// ２行目に命令を表す１つの文字列が与えられます。命令はそれぞれ図に示す４方向を表す文字 E、N、S、W を含む文字列です。
		
	}
}