/*A program that reads integer k and bit string s from command line, calcuates the 
Hamming Distances and prints all bit strings that have Hamming distance of "k" from "s"*/
import java.util.Scanner;

//open class
public class Hamming {

	//convert int into string
	static String convert(int n){
	String b=new String();
	int i,d;
		for(i=n;i!=0;i=i/2){
			d=i%2;
			b=d+b;
			}
		return b;
	}	//open main
	public static void main(String[] args) {
  
	Scanner sn=new Scanner(System.in);
	int n,l1,l2,i,d=0,k;
  
		String b1=new String();
		String b2=new String();
		String m;
  
	//read command line values
	k=Integer.parseInt(args[0]);
	b1=args[1];
	l1=b1.length();
	int len=(int) Math.pow(2, l1);
  
		//check all the integers
		for(int s=len-1;s>=0;s--){
			b2=convert(s);
			l2=b2.length();
		if(l1>l2){
		for(i=1;i<=l1-l2;i++){
			b2='0'+b2;
		}
	}
		else if(l2>l1){
			for(i=1;i<=l2-l1;i++){
			b1='0'+b1;
		}

	}
		d=0;
			for(i=0;i<b1.length();i++){
				if(b1.charAt(i)!=b2.charAt(i))
				d++;
}
  
		//if hamming length is k, then print the string
		if(d==k)
		System.out.print(b2+" ");
		}
		System.out.print("\n");
	}//close main
  
}//close class
