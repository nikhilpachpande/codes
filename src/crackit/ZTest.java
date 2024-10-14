package crackit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// group anagrams
public class ZTest {
	
	public static void main(String[] args) {
		
		
		String[] arr= {"ai","ia","mn","nm"};
		
		System.out.println(groupAnagrams(arr));
		
		
	}
	
	
	public static List<List<String>> groupAnagrams(String[] arr) {
		
		List<List<String>> groups = new ArrayList<>();
		
		boolean[] used = new boolean[arr.length];
		
		for (int i=0;i<arr.length;i++) {
			
			if(!used[i]) {
				
				List<String> group = new ArrayList<>();
				group.add(arr[i]);
				used[i]= true;
				
				for( int j =0;j<arr.length;j++) {
					if(anagrams(arr[j],arr[i])&& !used[j]) {
						
						group .add(arr[j]);
						used[j]= true;
					}
					
					
				}
				groups.add(group);
			}
			
		}
		return groups;
	}
	
	public static boolean anagrams(String str1, String str2) {
		
		int[] count = new int[256];
		
		Arrays.fill(count, 0);
		
		if(str1.length()!= str2.length()) return false;
		
		for (int i=0;i<str1.length();i++) {
			
			count[str1.charAt(i)]++;
			count[str2.charAt(i)]--;
			
			
		}
		
		for (int i=0;i<count.length;i++) {
			
			if(count[i]!=0) return false;
		}
		return true;
	}

}
