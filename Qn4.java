package Lab12.Assignment4;

import java.util.Scanner;

public class Qn4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number : ");
		int firstNumber = sc.nextInt();  //start index
		
		System.out.println("Enter the second number : ");
		int secondNumber = sc.nextInt(); // last index		
		System.out.println("Enter the third number : ");
		int thirdNumber = sc.nextInt(); // step size
		int i; //iterator or counter
		
		for(i = firstNumber; i <= secondNumber; i = i + thirdNumber) 
		
		{
			System.out.println("Number is : " + i);
			
		}
		

	}

}
