package crackit;

public class FirstOccuranceOfNonReapeating {
	
	public static void main(String[] args) {
		
		FirstOccuranceOfNonReapeating f = new FirstOccuranceOfNonReapeating();
		
		System.out.println(f.firstOccurance("aba"));
		
		
	}
	
	
	
	public int firstOccurance(String str) {
		
		
		for(int i=0;i<str.length();i++) {
			
			char ch= str.charAt(i);
			
			if(str.indexOf(ch)!=str.lastIndexOf(ch)) {
				
				return i;
			}
		}
		return -1;
	}

}
