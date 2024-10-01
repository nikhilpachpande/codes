package crackit;

import java.util.ArrayList;
import java.util.List;

public class SubArrayWithGivenSum {
	
	public static void main(String[] args) {
		
		SubArrayWithGivenSum x = new  SubArrayWithGivenSum();
		
		System.out.print(x.sum(new int[] {1,2,3,4,5}, 9));
		
	}
	
	
	public String sum(int[] arr,int k) {
		
		List l=  new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			
			int sum=0;
		
		
			for(int j=i;j<arr.length;j++) {
				
				sum=sum+arr[j];
				
				if(sum==k) {
					
					
					
					l.add(i);
					l.add(j);
					
					return l.toString();
				}
				
			}
		}
		return null;
	}

}
