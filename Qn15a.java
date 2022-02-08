package Lab12.Assignment4;

import java.util.Scanner;

public class Qn15a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the number : ");
		   int n = sc.nextInt(); //N x N Square 
		   int i =1;
		   while(i <= n) {
			   int j = 1;
			   while(j<=n) {
				   
				   System.out.print("*");
				  j++;   
			   } 
			   System.out.println("");
			   i++;
		   }

	}

}
