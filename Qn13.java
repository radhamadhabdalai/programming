package Lab12.Assignment4;

import java.util.Scanner;

public class Qn13 {

	public static void main(String[] args) {
		
		//enter a number for the multiplication table
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the number : ");
	   int n = sc.nextInt();
	   int digit;
	   int sum = 0;
	   
	   while(n != 0) {
		   digit = n%10;
		   sum = sum +digit;
		   n = n / 10;
	   }
	   
	   if(sum%9 ==0) {
	   System.out.println("Divisble by 9 ");
	
	   }
	   else 
	   {
		   System.out.println("Not Divisble by 9 ");
		   
	   }
	   }

}
