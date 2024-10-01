package crackit;

import java.util.Arrays;

public class MultiplyTwoMatrix {
	
	public static void main(String[] args) {
		
		
		int[][ ] res = multiply(new int[][] {{2,1},{1,2}}, new int[][] {{2,9},{1,2}});
		
		for(int[] arr : res) {
			System.out.println(Arrays.toString(arr));
		}
		
		
	}
	
	
	public static int []	[] multiply(int[][] matrix1, int[][] matrix2) {
		
		
		int row= matrix1.length;
		int col = matrix1[0].length;
		
		int[][] result = new int[row][col];
		
		
		for(int i=0;i<row;i++) {
			
			
			for(int j=0;j<col;j++) {
				
				for(int k=0;k< col;k++) {
					
					result[i][j] += matrix1[i][k] * matrix2[k][j];
					
					
				}
			}
		}
		return result;
		
	
		
		
		
		
		
	}

}
