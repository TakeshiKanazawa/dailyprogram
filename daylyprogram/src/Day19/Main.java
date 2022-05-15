package Day19;

/* 長方形の中に円が含まれるかを判定するプログラムを作成してください。
長方形は左下の頂点を原点とし、右上の頂点の座標(W, H)
が与えられます。
また、円はその中心の座標(x, y) と半径 r で与えられます。 

 Input
５つの整数 W、H、x、y、r が空白区切りで１行に与えられます。

Output 円が長方形の内部に含まれるなら Yes と、
一部でもはみ出るならば Noと１行に出力してください。 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		sc.close();
		  if (x - r < 0 || x + r > W || y - r < 0 || y + r > H) {
			    System.out.println("No");
			    return;
			  }
			  // x -r が0 以上、かつ、x + r がW 以下ならばYesと判定。
			  if (x - r >= 0 || x + r <= W || y - r >= 0 || y + r <= H) {
				    System.out.println("Yes");
				    return;
			  }
	}
}