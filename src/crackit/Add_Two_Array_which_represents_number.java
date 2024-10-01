package crackit;

import java.util.Arrays;

public class Add_Two_Array_which_represents_number {
	
	public static void main(String[] args) {
		
		Add_Two_Array_which_represents_number a= new Add_Two_Array_which_represents_number();
		
		int[] res =a.arr(new int[] {1,1,9}, new int [] {0});
		

		
		System.out.println(Arrays.toString(res));
		
		
	}
	
	
	public int[] arr(int[] arr1, int[] arr2) {
		
		if(arr1.length>arr2.length) arr2=resize(arr2, arr1.length);
		else arr1=resize(arr1, arr2.length);
		
		
		
		
		
		
		int i=arr2.length-1;
		int[] res = new int[i+2];
		int k= i+2-1;
				;
		int carry=0;
		
		
		
		while(i>=0) {
			System.out.println("i "+i);
			
			int sum=arr1[i]+arr2[i]+carry;
			
			carry=sum/10;
			
			int e=sum%10;
			System.out.println("k "+k);
			
			res[k]=e;
			
			i--;
			k--;
			
					
		}
		System.out.println("k carr"+k);
		res[k]=carry;
		return res;
		
		
		
		
	}
	
	public int[] resize(int[] arr,int len) {
		
		int[] newArray= new int[len];
		
		int k= len-1;
		
		for(int i=arr.length-1;i>=0;i--) {
			
			newArray[k--]=arr[i];
			
		}
		return newArray;
	}

}
