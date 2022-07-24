package Day41;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//太郎のスコア
		int taroScore = 0;
		//花子のスコア
		int hanakoScore = 0;
				
		//一行目にカードの数ｎが与えられる。
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			//入力:太郎のカードに書かれている文字列
			String taroCard = sc.next();
			//入力:花子のカードに書かれている文字列
			String hanakoCard = sc.next();
			//ドロー
			
			if(taroCard.equals(hanakoCard)) {
				taroScore += 1;
				hanakoScore += 1;
			}
			//win
			if(taroCard.compareTo(hanakoCard) > 0) {
				taroScore += 3;
				//lose	
			}else if(taroCard.compareTo(hanakoCard) < 0){
				hanakoScore += 3;
			}
		}
		System.out.println(taroScore + " " + hanakoScore);
	}
}