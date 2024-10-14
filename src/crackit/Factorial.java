package crackit;

public class Factorial {
	// invalid code this is not factorial code;
	public static void main(String[] args) {
		
		int first =0;
		int second =1;
		
		
		for (int i=0;i<5;i++) {
			
			System.out.println(first);
			
			int sum = first + second;
			first = second;
			second =sum;
		}
		
		
		
		
	}
	
	
	
	

}
