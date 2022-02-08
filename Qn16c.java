package Lab12.Assignment4;

import java.util.Scanner;

public class Qn16c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the number of rows : ");
		   int n= sc.nextInt();
		   for(int i =1; i <=n ; i ++) // line no
		   {
			   for(int j =1; j <=i ; j ++) {  // value or column
				   
				   System.out.print(i);
			   }
			   System.out.println("");
		   }
		
	}

}
