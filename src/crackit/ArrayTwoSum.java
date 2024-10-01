package crackit;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayTwoSum {
	//array is sorted
	
	public static void main(String[] args) {
		
		ArrayTwoSum a = new ArrayTwoSum();
		
		System.out.println(a.twoSum(new int[] {1,2,3}, 3));
		
		
	}
	
	public List twoSum(int[] arr,int key) {
		
		int start =0;
		int end= arr.length-1;
		
		while (start<=end) {
			
			int sum = arr[start]+arr[end];
			
			if(sum==key) return List.of(start,end);
			else if(sum>key) end --;
			else start++;
		}
		return null;
		
		
		
		
	}

}
