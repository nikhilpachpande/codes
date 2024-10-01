package crackit;

public class FibonachiRecursion {
	
	public static void main(String[] args) {
		
		FibonachiRecursion f = new FibonachiRecursion();
		
		
		
		for(int i=0;i<3;i++) {
			
			System.out.println(f.fibonachi(i));
			
		}
	}
	
	
	
	public Integer fibonachi(int n) {
		
		if(n==0) return 0;
		if(n==1 || n==2) return 1;
		
		return fibonachi(n-1)+fibonachi(n-2);
	}

}
