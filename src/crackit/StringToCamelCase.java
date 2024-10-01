package crackit;

import java.util.Arrays;

// convert name_nikhil_pachpande to Name Nikhil Pachpande
public class StringToCamelCase {
	
	public static void main(String[] args) {
		
		String r="name_nikhil_pachpande";
		
		String[] l=r.split("_");
		
		StringToCamelCase  a= new StringToCamelCase();
		
		for(int i=0;i<l.length;i++) {
			
			l[i]=a.camelCase(l[i]);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(String s:l) sb.append(s).append(" ");
		
		String result = sb.toString();
		
		
		
		System.out.println(result);
		
		
		
	}
	
	public String camelCase(String s) {
		
		String[] arr= s.split("");
		
		String result="";
		
		for(int i=0;i<arr.length;i++) {
			
			if(i==0) arr[0]=arr[0].toUpperCase();
			else {
				
				result=arr[0].concat(s.substring(1));
				
			}
		}
		return result;
				
	}

}
