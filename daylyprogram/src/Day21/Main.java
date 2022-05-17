package Day21;

import java.util.Scanner;

//２つの整数 x, y を読み込み、それらを値が小さい順に出力するプログラムを作成して下さい。
//ただし、この問題は以下に示すようにいくつかのデータセットが与えられることに注意して下さい。

//Input
//入力は複数のデータセットから構成されています。
//各データセットは空白で区切られた２つの整数 x, y を含む１行から構成されています。
//x と y がともに 0 のとき入力の終わりを示し、このデータセットに対する出力を行ってはいけません。
//Output
//各データセットごとに、x と y を小さい順に並べたものを１行に出力して下さい。x と y の間には１つの空白を入れて下さい。

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(x != 0 || y != 0) {
				if(x > y) {
					System.out.println(y + " " +  x);
				}else {
					System.out.println(x + " " +  y);
				}
			}else {
				break;
			}
		}	
	}
}
