package crackit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TriangleWithIf {
	
	public static void main(String[] args){
		
		
		 int n=5;
		 
		 for(int row =1; row<=n;row++) {
			 
			
			 
			 for(int col =1;col<=n;col ++) {
				 
//				System.out.print("* ");
				
				if(col<=n-row) System.out.print(" ");
				else System.out.print("* ");
				 
				 
				 
		
				 
				 
			 }
			 
			 
			 System.out.println();
		 }
		
		 
		
	}
	

}

 
 