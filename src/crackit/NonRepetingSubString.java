package crackit;

import java.util.LinkedHashSet;
import java.util.Set;

public class NonRepetingSubString {
	
	public static void main(String[] args) {
		
		NonRepetingSubString a = new NonRepetingSubString();
		
		System.out.println(a.subString("abccbaq"));
		
		
		
	}
	
	public int subString(String str) {
		
		Set<Character> set = new LinkedHashSet<>();
		
		int max=0;
		
		for (int i=0;i<str.length();i++) {
			
			if(!set.contains(str.charAt(i))) {
				
				set.add(str.charAt(i));
				max= Math.max(max, set.size());
			}
			
			else {
				set.remove(str.charAt(i));
			}
		}
		return max;
	}

}
