package crackit;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CommonElementBetweenTwoArrays {
	
	public static void main(String[] args) {
		
		Integer[] arr1= {1,2,3};
		Integer[] arr2= {3,4,5};
		
		
		Set<Integer> set1 = new LinkedHashSet<>();
		
		Set<Integer> set2 = new LinkedHashSet<>();
		
		for (int i=0;i<arr1.length;i++) set1.add(arr1[i]);
		
		for (int i=0;i<arr2.length;i++) set2.add(arr2[i]);
		
		set1.retainAll(set2);
		
		System.out.println(set1);
		
		// ----------------List method----------------------------//
		
		for (int i:arr1) {
			if(Arrays.asList(arr2).contains(i)) System.out.println("common element is"+i);
		}
		
		
	}

}
