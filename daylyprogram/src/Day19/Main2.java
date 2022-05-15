package Day19;

public class Main2 {
	public static void main(String[] args) {
		foo(1);
	}
	public static void foo(int n){
	    if(n < 50){
	        foo(n+10);
	    	//ここで関数fooをn+10で呼び出す為、後続の出力処理は呼ばれない
	        //n = 51になってはじめて再起関数fooの条件判定が終了
	        //それまで待ち受けていた下記の処理が走る
	        //実行結果=41,31,21,11,1
	        System.out.println(n);


	    }
	}
}