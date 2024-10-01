package crackit;

import java.util.Arrays;

public class MergeTwoSortedArray {
	public static void main(String[] args) {
		
		MergeTwoSortedArray a = new MergeTwoSortedArray();
		
		System.out.println(a.merge(new int[] {1,3,5}, new int[] {2,4}));
		
		
	}
	
	public String merge(int[] arr1, int[] arr2) {
		
		int i=0;int j=0;
		int k=0;
		int l1= arr1.length;
		int l2 = arr2.length;
		
		int[] arr= new int[l1+l2];
		
		while(i<l1&& j<l2) {
			
			if(arr1[i]<=arr2[j]) arr[k++]= arr1[i++];
			
			else arr[k++]=arr2[j++];
		}
		
		while(i<l1) arr[k++]= arr1[i++];
		
		while(j<l2) arr[k++]= arr2[j++];
		
		return Arrays.toString(arr);
		
	}
	
	

}
