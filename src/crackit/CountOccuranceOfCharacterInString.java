package crackit;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccuranceOfCharacterInString {
	
	public static void main(String[] args) {
		
		String str= "plaster of paris";
		
//		char[] ch= str.toCharArray();
		
		String[ ] ch = str.split("");
		
		Map<String,Long> count=Arrays.stream(ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(count);
	}

}
