package crackit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

//find the occurance of non repeating character



public class ZTest {
	
	
	public static void main(String[] args) {
		
		System.out.println(fibonachi(5));
	}
	
	

		
		

	
	public static int fibonachi(int n) {
		if(n==0 ) return 0;
		if(n==1 || n==2) return 1;
		
		return fibonachi(n-1)+ fibonachi(n-2);
	}
	
	
	
}
	
	




