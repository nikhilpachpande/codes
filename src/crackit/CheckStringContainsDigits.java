package crackit;

public class CheckStringContainsDigits {
	
	public static void main(String[] args) {
		
		String str = "2bac";
		
		for(char i :str.toCharArray()) if(Character.isDigit(i)) System.out.println("Strign contaains digit");
		
		
	}

}
