package crackit;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
//code to group anagrams 
public class AangramsLinearTime {
	
	
	public static void main(String[] args) {
		
		
		String str1 = "nikhil";
		String  str2 = "nikhil";
		
		System.out.println(checkAnagrams(str1,str2));
	}
	
	
	public static boolean  checkAnagrams(String str1,String str2) {
		
		int[] count = new int[256] ;
		
		Arrays.fill(count, 0);
		
		if(str1.length()!= str2.length()) return false;
		
		for (int i=0;i<str1.length();i++) {
			
			 //here we are converting char to integer;
			
			count[str1.charAt(i)]++ ;// here we are converting char to integer; 
			count[str2.charAt(i)]--	; // and if string 2 have the same element then we will remove 1;
				
		}
		
		// now check if their is any value is there in count other than 0;
		
		for (int i =0 ;i<256;i++) {
			
			if(count[i]!=0) return false;
		}
		return true ;
		
	}
	
	
	
}
