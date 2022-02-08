package Lab12.Assignment4;

import java.util.Scanner;

public class Qn16d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the number of rows : ");
		   int n= sc.nextInt();
		   for(int i =1; i <=n ; i ++) 
		   {
			   for(int j =1; j <=i ; j ++) {
				   int t = i;
				   System.out.print(t);
				   t++;
			   }
			   System.out.println();
		   }

	}

}
