package crackit;

public class BinarySearch {
	
	
	public static void main(String[] args) {
		
		BinarySearch b= new BinarySearch();
		System.out.print(b.search(new int[] {1,2,3,4,5,6}, 3));
		
	}
	
	public Integer search(int[] arr, int key) {
		
		int start =0;
		int end = arr.length-1;
		
		
		
		while(start<=end) {
			
			int mid =start + (end - start) / 2;
			if(key==arr[mid]) {
				
				return mid;
			}
			else if(key< arr[mid]) {
				
				
				end = mid-1;
			}
			
			else if(key> arr[mid]) {
				start = mid +1;
			}
		}
		return null;
		
		
		
		
	}

}
