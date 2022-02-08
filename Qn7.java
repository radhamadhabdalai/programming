package Lab12.Assignment4;

import java.util.Scanner;

public class Qn7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		float sum = 0;
		
		for(int i = 1; i <=n ; i++) 
		{
			sum = (float) (sum + Math.random());
			
		} 
            System.out.println("Average is  : " + (sum / n));
	}

}
