package crackit;

public class TriangleNumberPattern {
	
	public static void main(String[] args) {
		
		
		int i=0;int j=0;
		
		
		for(i=1;i<5;i++) {
			
			for(  j=1;j<5-i;j++) {
				
				
				System.out.print(" ");
				
			}
			
			for ( j=1;j<=i;j++) {
				System.out.print(i+" ");
				
				
			}
			
			System.out.println();
			
			
		}

	
	
	}

}
