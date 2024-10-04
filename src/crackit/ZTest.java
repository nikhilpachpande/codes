package crackit;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;

//format date



public class ZTest {
	
	
	public static void main(String[] args) {
		
		
		LocalDateTime dt = LocalDateTime.now();
		String np = dt.format(DateTimeFormatter.ofPattern("dd"));
		 
		 System.out.println(np);
		
		
		
		 
		
	}
	
	
	
}
	
	




