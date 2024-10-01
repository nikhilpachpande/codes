package crackit;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDate {
	
	public static void main(String[] args) {
		
		LocalDateTime dt = LocalDateTime.now();
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-yyyy");
		
		System.out.print( dt.format(df));
	}

	
}
