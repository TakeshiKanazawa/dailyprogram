//package Day49;
//
//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int N_gondraNumber = 0;
//		int M_groupNumber = 0;
//
//		
//		//1 行目にそれぞれゴンドラの数とグループの数を表す整数 N, M がこの順で半角スペース区切りで与えられます。
// 
//        	N_gondraNumber=sc.nextInt();
//        	M_groupNumber=sc.nextInt();
//     
//        
//		// ゴンドラ乗車できる人数を表す配列
//		int[] maxMember = new int[N_gondraNumber];
//        // i番目のゴンドラに乗車できる人数の制限を表す整数 A_i が与えられます。
//        for(int i=0; i < N_gondraNumber; i++){
//        	maxMember[i] = sc.nextInt();
//        }
//        
//		// i 番目のグループの人数を表す整数 を表す配列
//		int[] groupMember = new int[N_gondraNumber];
//        //i 番目のグループの人数を表す整数 B_i が与えられます。
//        for(int i=0; i < M_groupNumber; i++){
//        	groupMember[i] = sc.nextInt();
//        //	i = 0;
//        }
//		// ゴンドラを表す配列
//		int[] gondra = new int[N_gondraNumber];
//		
//		//ここから処理
//		//ゴンドラ待ちの人間
//		int nokorininzuu = 0;
//		for (int i : groupMember) {
//			nokorininzuu += i;
//			//ここにforぶん
//			for (int j = 0; j < gondra.length; j++) {
//				if(maxMember[j] )
//			}
//	
//				
//			}
//		}
//		
//		//グループiの人数
//		int gruopninzu = 0;
//		
//		//ゴンドラ待ちの人間が0になるまで
//	      for(int i=0; i < M_groupNumber; i++){
//	if()
//			//ゴンドラ人数制限 - グループの人数
//			
//		
//		
//		//各ゴンドラ * 人間が乗り込んだ数
//		//ゴンドラ配列をループで回し出力
//		for (int i = 0; i <gondra.length; i++) {
//			System.out.println(gondra[i]);
//			
//		}
//	}
//}