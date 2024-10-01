package crackit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
	
	public static void main(String[] args) {
		
		GroupAnagrams g = new GroupAnagrams();
		
		System.out.println(g.groupAnagrams(new String[] {"ia","ai","er","re"}));
		
		
	}
	
	
	public List<?> groupAnagrams(String[] arr) {
		
		List<List<String>> list = new ArrayList<>();
		boolean[] used = new boolean[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			
			List<String> group = new ArrayList<>();
			
			if(!used[i]) {
				group.add(arr[i]);
				used[i]=true;
			
			
			for(int j= 0;j<arr.length ;j++) {
				
				if(!used[j] && checkAnagrams(arr[j],arr[i])) {
				
				group.add(arr[j]);
				used[j]=true;}
				
				
			}
			
			list.add(group);
			}
			
		}
		return list;
		
		
		
		
	}
	
	
	public boolean checkAnagrams(String str1, String str2) {
		
		char [] arr1 = str1.toCharArray();
		char [] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
	}

}
