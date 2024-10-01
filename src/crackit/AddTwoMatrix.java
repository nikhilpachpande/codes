package crackit;

import java.util.Arrays;

public class AddTwoMatrix {
	
	public static void main(String[] args) {
		
		AddTwoMatrix a = new AddTwoMatrix();
		
		int [][] res = a.add(new int[][] {{1,1},{1,1}}, new int[][] {{1,1},{1,1}});
		
		System.out.println(Arrays.toString(res));
		
		for(int[] arr: res) {
			
			System.out.println(Arrays.toString(arr));
		}
	}
	
	public int[][] add(int[][] matrix1 , int[][] matrix2){
		
		
		int[][] result= new int[matrix1.length][matrix1[0].length];
		
		for(int i=0;i<matrix1.length;i++) {
			
			
			for(int j=0;j<matrix1[0].length;j++) {
				
				result[i][j]=matrix1[i][j]+matrix2[i][j];
				
				
				
			}
		}
		return result;
		
		
		
	}

}
