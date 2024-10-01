package crackit;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
	
	public static void main(String[] args) {
		
		Integer[] arr= {1,2,2,1,1};
		
		Set<Integer> set= new LinkedHashSet<>(Arrays.asList(arr));
		System.out.println(set);
		
		Arrays.stream(arr).distinct().forEach(System.out::println);
	}

}
