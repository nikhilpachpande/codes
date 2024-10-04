package crackit;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;

//rotate an array



public class RotateArrayUsingPercent {
	
	public static void main(String[] args) {
		
		int[] rotated = rotate(new int[] {1,2,3,4,5},3);
		//54312
		//4,3,,2,0,1
		
		System.out.println(Arrays.toString(rotated));
	}
	
	
	public static int[] rotate (int[] arr, int k ) {
		
		
		int[] rotated= new int[arr.length];
		
		int n=arr.length;
		
		for ( int i=0;i<arr.length;i++) {
			
			
			int position= ((i+k)%n);
			
			System.out.println(position);
			
			rotated[position]= arr[i];
			
			
		}
		return rotated;
		

	}
	
	
	
	
	
	
}
	
	




