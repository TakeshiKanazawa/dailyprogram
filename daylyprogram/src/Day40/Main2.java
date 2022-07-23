package Day40;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//ABC 261 A問題
// X=L1からX=R1までを全て赤色で塗る
//X=L2からX=R2までを全て青色で塗る
//数直線のうち、赤色と青色の両方で塗られている部分の長さを求める	

//入力
//L1 R1 L2 R2


public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//解答用変数
		Integer Ans = 0;
		 List<Integer> list1 = new ArrayList<Integer>();
		 List<Integer> list2 = new ArrayList<Integer>();
		
		//標準入力
		int L1 = sc.nextInt();
		int R1 = sc.nextInt();	
		int L2 = sc.nextInt();	
		int R2 = sc.nextInt();	
		for (int i = L1; i < R1; i++) {
			list1.add(i);
		}
		for (int i = L2; i < R2; i++) {
			list2.add(i);
		}
	       // listAの要素のうちlistBにないものを削除 
        boolean result = list1.retainAll(list2);
		//解答
        System.out.println(list1.size());
	}
}