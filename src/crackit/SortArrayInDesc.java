package crackit;

import java.util.Arrays;
import java.util.Comparator;

public class SortArrayInDesc {
	
	public static void main(String[] args) {
		
		Integer[] arr= {2,1,4};
		
//		Arrays.sort(arr,Comparator.reverseOrder());
		
		Comparator<Integer> cm = (a,b)->b-a;
		
		Arrays.sort(arr, cm);
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}

}
