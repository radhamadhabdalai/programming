package Lab12.Assignment4;

import java.util.Scanner;

public class Qn10 {

	public static void main(String[] args) {
		//enter a number for the multiplication table
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		for(int i = 1 ;i <= 10 ; i++) 
		{
		
			 System.out.println(n+"x" + i + "="+ n*i);

	     }
	}
}
