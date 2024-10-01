package crackit;

public class Fibonachi {
	
	public static void main(String[] args) {
		
		int first =0;
		int second =1;
		int sum =0;
		
		for(int i=0;i<10;i++) {
			
			System.out.println(first);
			
			sum = first + second;
			first =second;
			second =sum;
			
			
		}
	}

}
