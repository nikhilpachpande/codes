package crackit;

public class ReverseStringInPlace {
	
	public static void main(String[] args) {
		
		String str = "nikhil";
		
		char[] ch=str.toCharArray();
		
		int start=0;
		int end = ch.length-1;
		
		while(start< end) {
			
			char temp = ch[start];
			ch[start]=ch[end];
			ch[end]= temp;
			start ++;
			end --;
			
			
					
		}
		
		System.out.println(new String(ch));
	}

}
