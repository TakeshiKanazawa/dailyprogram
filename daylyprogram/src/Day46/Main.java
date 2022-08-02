package Day46;

//サイコロのクラス
// ①東西南北(E、N、S、W)に動かすメソッド(ifで分岐させる)
// ②サイコロの上面を出力するメソッド
// を定義
class Dice {
	int[] diceArray;
	int tmp;

	// コンストラクタ
	public Dice(int[] dice) {
		this.diceArray = dice;
	}

	// サイコロを転がす(N方向)
	void move(String[] strArray) {
		for (int i = 0; i < strArray.length; i++) {
			int temp;
			// N方向の時の動き
			if (strArray[i].equals("N")) {
				// 退避用変数
				temp = this.diceArray[0];
				// n方向に動かした後のダイス面を変更
				this.diceArray[0] = this.diceArray[1];
				this.diceArray[1] = this.diceArray[5];
				this.diceArray[5] = this.diceArray[4];
				this.diceArray[4] = temp;
			}
			// S方向の時の動き
			if (strArray[i].equals("S")) {
				// 退避用変数
				temp = this.diceArray[0];
				// n方向に動かした後のダイス面を変更
				this.diceArray[0] = this.diceArray[4];
				this.diceArray[4] = this.diceArray[5];
				this.diceArray[5] = this.diceArray[1];
				this.diceArray[1] = temp;
			}
			// W方向の時の動き
			if (strArray[i].equals("W")) {
				temp = this.diceArray[0];
				// n方向に動かした後のダイス面を変更
				this.diceArray[0] = this.diceArray[2];
				this.diceArray[2] = this.diceArray[5];
				this.diceArray[5] = this.diceArray[3];
				this.diceArray[3] = temp;
			}
			// E方向の時の動き
			if (strArray[i].equals("E")) {
				temp = this.diceArray[0];
				// n方向に動かした後のダイス面を変更
				this.diceArray[0] = this.diceArray[3];
				this.diceArray[3] = this.diceArray[5];
				this.diceArray[5] = this.diceArray[2];
				this.diceArray[2] = temp;
			}
		}
	}

	// サイコロの上面の数を出力
	void print() {
		System.out.println(diceArray[0]);
	}
}

//サイコロ I
//■考察
// 求めたいのは頂点(上面)の数
//サイコロをn方向に動かした時点の数を都度保持しておき、最終的に出力させれば解くことは可能
//例えば[1]が頂点のとき、Wがにゅうりょくされたら4 Eなら3など

public class Main {
	public static void main(String[] args) {}
}