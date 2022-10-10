package Day63;

import java.util.Scanner;

//英大文字からなる文字列 S が与えられます。S の部分文字列 (注記を参照) であるような最も長い 
//ACGT 文字列 の長さを求めてください。
//ここで、ACGT 文字列とは A, C, G, T 以外の文字を含まない文字列です。

//考察
//入力文字列を1文字ずつ取り出して、A,C,G,Tいづれかの文字と合致する場合
//変数countをカウントcup
//一致しない場合は、変数countを0にリセットする
//MAth.max()を使用して、最終的に最も長い文字列を出力させるようにする

class Main{
	  public static void main(String[] args) {
	    Scanner str=new Scanner(System.in);
	    String s=str.next();
	    char[] c=new char[s.length()];
	    int count=0,ans=0;
	    for(int i=0;i<s.length();i++){
	      c[i]=s.charAt(i);
	      if(c[i]=='A'||c[i]=='C'||c[i]=='G'||c[i]=='T'){
	        count++;
	      }else{
	        count=0;
	      }
	      
	      ans=Math.max(ans, count);
	    }
	    System.out.println(ans);
	      }
	    }
