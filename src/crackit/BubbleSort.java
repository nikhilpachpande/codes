package crackit;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		BubbleSort b = new BubbleSort();
		System.out.println(b.sort(new int[] {2,1,3}));
		
	}
	
	public String sort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= temp;
				}
				
			}
		}
		return Arrays.toString(arr);
	}

}
