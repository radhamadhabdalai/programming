package Lab12.Assignment4;

import java.util.Scanner;

public class Qn14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the number : ");
		   int n = sc.nextInt(); //N value
		   
		   int i = 0;
		   
		   while(Math.pow(2, i) <= n) {
			   
			   i++;
		   }
		   System.out.println("The largets power of 2 which is less or equal to the number "+n+" : " + (i-1));

	}

}
