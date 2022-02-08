package Lab12.Assignment4;

import java.util.Scanner;

public class Qn12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("N \t N\u00b2 \t N"+"³"+ "\t" + "2^n" + "\t"+"Logn");
		System.out.println( n + "\t"+ n *n + "\t"+ Math.pow(n,3) +"\t" +Math.pow(2, n)+"\t"+Math.log(n) );
		
		
		
	}

}
