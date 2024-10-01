package crackit;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		
		InsertionSort i = new InsertionSort();
		
		System.out.println(i.sort(new int[] {2,1,3}));
		
	}
	
	public String sort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			int j=i-1;
			int key= arr[i];
			
			while(j>=0 && key <arr[j]) {
				
				arr[j+1] =arr[j];
				
				
				j--;
			}
			arr[j+1]=key;
			
		}
		return Arrays.toString(arr);
		//1,2,3
	}

}
