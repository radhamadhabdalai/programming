package Lab12.Assignment4;

import java.util.Scanner;

public class Qn3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		
		int number = sc.nextInt(); //end index
		
		// this is for loop
		int startIndex = 0;
		int i; //counter or iterator
		for(i = startIndex; i <= number; i++ ) 
		{
			System.out.println("Number is :" + i);
		}
		

	}

}
