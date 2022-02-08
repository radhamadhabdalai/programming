package Lab12.Assignment4;

public class Qn9 {

	public static void main(String[] args) {
		int row = 1;
		int sum =0;
		for(int i = 1 ;i < 10 ; i++) {
			
		  if ((i %3 ==0) || (i % 5 ==0))
		  {
			  sum = sum +i;
			  
		  }
		   
		
		}

		 System.out.println("Sum of all : " + sum);
	}

}
