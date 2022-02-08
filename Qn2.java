package Lab12.Assignment4;

public class Qn2 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]); //end index
		int i = 1; //start Index
		String message = "Hello"; // 1 t0 1000
		
		while(i <=n) 
		
		{
			  if (i%10 == 1) 
			  {
				 if(i==11 ) {
					 
					 System.out.println(i+"th " +message);
				 }
				  
				 else {
					 System.out.println(i+"st " +message);
					 
				 }
				  
				  
			  }
			  
			  else if (i%10 == 2) 
				  
			  {
				  if(i==12) {
				  System.out.println(i+"th " +message);  
				  }
				  
				  else {
					  
					  System.out.println(i+"nd " +message);
				  }
			  }
			  
			  else if (i%10 == 3) 
			  {
				  if(i==13) {
					  System.out.println(i+"th " +message);  
					  }
					  
					  else {
						  
						  System.out.println(i+"rd " +message);
					  }
				  
			  }
			  else  
			  {
				System.out.println(i+"th " +message);  
				  
			  }
			
			
		       i = i + 1;	
		}

	}

}
