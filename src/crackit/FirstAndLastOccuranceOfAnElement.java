package crackit;

import java.util.List;

public class FirstAndLastOccuranceOfAnElement {
	
	public static void main(String[] args) {
		
		FirstAndLastOccuranceOfAnElement a =  new FirstAndLastOccuranceOfAnElement();
		
		System.out.println(a.occurance(new int[] {1,2,3,4,1}, 1));
		
		
		
	}
	
	public List occurance(int [] arr, int key) {
		
		int first =-1;
		int second =-1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key && first==-1) {
				first=i;
			}
			
			else if(arr[i]==key) {
				second= i;
			}
		}
		return List.of(first,second);
		
		
	}

}
