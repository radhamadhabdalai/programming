package Lab12.Assignment4;

import java.util.Scanner;

public class Qn16b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the number of rows : ");
		   int n= sc.nextInt();
		   for(int i =1; i <=n ; i ++) //row or line no
		   {
			   for(int j =1; j <=i ; j ++)  // column or value 
			   { 
				   
				   System.out.print(j);
			   }
			   System.out.println();
		   }
	}

}
