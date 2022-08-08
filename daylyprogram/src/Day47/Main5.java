package Day47;

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// N H W
        int[] numbers = new int[3];//int型の要素を代入する配列numbersを用意
        //forループを回して、nextInt()でスペースの直前の数字をnumbersに代入していく
        for(int i=0; i<numbers.length; i++){
            numbers[i]=sc.nextInt();
        }
        // sy sx
        String[] words = sc.nextLine().split(" ");
        
        //s
        String s = sc.nextLine();
        String[] dice = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
			dice[i] = String.valueOf(s.charAt(i));
		}

}
}