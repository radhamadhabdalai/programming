package Lab12.Assignment4;

import java.util.Scanner;

public class Qn17 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		
		for(int i =1 ; i <= n ;i++) { // row
			
			for (int j = 1; j <=n ;j++) { //column
				
				if(j % i ==0 || i % j ==0) {
					
					System.out.print("*"); 
					
				}
				else {
					
					System.out.print(" ");// put space character " "
				}
				
			}
			System.out.println(i);
		}

	}

}
