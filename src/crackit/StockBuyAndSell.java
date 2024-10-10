package crackit;


public class StockBuyAndSell {
	
	public static void main(String[] args) {
		
		int [ ] arr = {2,4,2,1,5,8,9};
		
		System.out.println(method(arr));
		
		
		
	}
	
	
	public static int  method(int[] arr){
		
		// 1,4,2,5,3,9
		
		int maxProfit=0;
		int minSoFar = arr[0];
		for (int i=0;i<arr.length;i++) {
			
			minSoFar =Math.min(minSoFar, arr[i]);
			
			int profit = arr[i]- minSoFar;
			
			maxProfit = Math.max(maxProfit,profit );
			
			
			
			
		}
		return maxProfit;
	}

}
