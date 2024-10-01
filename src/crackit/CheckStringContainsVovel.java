package crackit;

import java.util.List;

public class CheckStringContainsVovel {
	
	public static void main(String[] args) {
		
		String str = "nikhil";
		
		for(char i : str.toCharArray()) {
			
			if(List.of('a','i').contains(Character.valueOf(i))) System.out.println("String contains vovel");
		}
	}

}
