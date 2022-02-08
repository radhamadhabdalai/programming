package Lab12.Assignment4;

import java.util.Scanner;

public class Qn16a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the number of rows : ");
		   int n= sc.nextInt();
		   for(int i =1; i <=n ; i ++)  // i keeps track of line number
		   {
			   for(int j = 1; j <= i ; j ++) // j keeps track of printing number of "*"
			   {  //column
				   
				   System.out.print("*");
			   }
			   System.out.println("");
		   }
	}

}
