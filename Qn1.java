package Lab12.Assignment4;

import java.util.Scanner;

public class Qn1 {

	public static void main(String[] args) {
		
		String message;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the message");
		message = sc.nextLine();
		
		int i = 1; 	//start index	i = iterator
		int n = 10; // endIndex
		
		while(i <= n) 
		{
		   if(i==1) {
			   System.out.println(i+"st " +message);
		   }
		   else if (i==2) {
			   System.out.println(i+"nd " +message);
		   }
		   else if (i==3) 
		   {
			   System.out.println(i+"rd " +message);
		   }
		   else 
		   {
			System.out.println(i+"th " +message);	
		   }
			
			i = i + 1;
		}

	}

}
