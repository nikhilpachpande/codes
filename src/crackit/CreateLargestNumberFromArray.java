package crackit;

import java.util.Arrays;
import java.util.Comparator;

public class CreateLargestNumberFromArray {
	
	public static void main(String[] args) {
		
		String[] arr= {"1","2","43","12"};
		
		Comparator<String> cm= (a,b)->(b+a).compareTo(a+b);
		
		Arrays.sort(arr,cm);
		
		System.out.println(Arrays.toString(arr));
	}

}
