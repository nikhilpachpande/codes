package crackit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// multiply two matrix



public class MatrixMultiplicationDiffSize {
	
	public static void main(String[] args) {
		
		
		MatrixMultiplicationDiffSize t = new MatrixMultiplicationDiffSize();
		
		
		int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
        int[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} };
		
		int[][] res = t.multiplyMatrix(firstMatrix, secondMatrix);
		
		for(int[] arr: res) {
			
			System.out.println(Arrays.toString(arr));
		}
	}
	
	public int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2){
		
		
		
		
		int r1 = matrix1.length;
		int c1 = matrix1[0].length;
		
		int r2 = matrix2.length;
		int c2 = matrix2[0].length;
		
		
		
		int [] [] result = new int[r1] [c2];
		
		
		for (int i =0 ;i<r1;i++) {
			for (int j=0;j<c2;j++) {
				for (int k=0;k<c1;k++) {
					
					result[i][j]+= matrix1[i][k]* matrix2[k][j];
					
				}
			}
		}
		return result;
	}
	
	
	
}
