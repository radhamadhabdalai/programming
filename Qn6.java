package Lab12.Assignment4;

public class Qn6 {

	public static void main(String[] args) {
		int count  = 1;
		for(int i = 1000; i <=2000; i++) {
			
			if(count <= 5) {
				
				System.out.print(i);
				
				if(count == 5) {
					
					count = 0;
					System.out.println("n");
				}
				
				
				count++;
			}
			
			else{
				
				System.out.println(i);
			};
		}
		

	}

}
