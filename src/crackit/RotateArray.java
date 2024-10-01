package crackit;

import java.util.Arrays;
import java.util.List;

public class RotateArray {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		int k=3;
		k=k%arr.length;
		
		System.out.println("k "+k);
		
		reverse(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
		reverse(arr,0,k-1);
		
		System.out.println(Arrays.toString(arr));
		
         reverse(arr,k,arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}
	
	public static void reverse(int[] arr , int start, int end) {
		
		while(start<=end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	

}
