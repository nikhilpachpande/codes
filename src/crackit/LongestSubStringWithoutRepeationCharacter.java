package crackit;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeationCharacter {
	
	public static void main(String[] args) {
		
		LongestSubStringWithoutRepeationCharacter b= new LongestSubStringWithoutRepeationCharacter();
		
		System.out.println(b.subString("abcce"));
		
		
	}
	
	
	public Integer subString(String str) {
		
		
		Set<Character> set = new LinkedHashSet<>();
		
		int start=0;
		int end = 0;
		int max=0;
		
		while(end<str.length()) {
			
			if(!set.contains(str.charAt(end))) {
				
				set.add(str.charAt(end));
				end++;
				
				max= Math.max(set.size(), max);
			}
			
			else {
				set.remove(str.charAt(start));
				start++;
			}
		}
		return max;
		
		
		
	}

}
