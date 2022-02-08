package Lab12.Assignment4;

import java.util.Scanner;

public class Qn11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		
		int startNumber = 1;
		int endNumber = n;
		int sumOfSquares = 0;
		int sumOfWholeSquares = 0;
		int sumOfNumber = 0;
		for(int i = startNumber ; i <= endNumber ; i++) 
		
		{
			sumOfNumber = sumOfNumber + i;
			sumOfSquares = sumOfSquares + i * i;
		}
		
		sumOfWholeSquares = sumOfNumber * sumOfNumber; 
		
		System.out.println("The sum of square of numbers are, " +"1\u00b2+" + "2\u00b2+"+"..." + n+"\u00b2=" + sumOfSquares );
		System.out.println("The square of the sum of the first "+n+" natural numbers is,"
		+"(1+2+....+"+n+")\u00b2="+sumOfWholeSquares);
	}

}
