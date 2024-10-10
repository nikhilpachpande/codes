package crackit;

import java.util.Arrays;

public class MoveZeros {
	
	public static void main(String [] args) {
		
		
		int[] arr= {1,0,4,5,0,3,9};
		method(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	public static void method(int [] arr) {

		
		int i=0;
		for (int j=0;j<arr.length;j++) {
			
			if(arr[j]!=0) {
				
				//swap arr[i] and arr[j]
				
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]= temp;
			
				i++;
	
			
			}
			
			
			
		}

	}
	

}
