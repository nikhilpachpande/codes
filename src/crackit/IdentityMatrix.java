package crackit;

public class IdentityMatrix {
	
	public static void main(String[] args) {
		
		IdentityMatrix i= new IdentityMatrix();
		
		int[][] matrix = {{1,0,0},{0,1,0},{0,0,1}};
		
		System.out.println(i.matrixCheck(matrix));
		
		
	}
	
	
	public boolean matrixCheck(int[][] matrix) {
		
		
		int row = matrix.length;
		int col = matrix[0].length;
		
		for(int i=0;i<row;i++) {
			
			for (int j=0;j<col;j++) {
				
				if(matrix[i][j]!=1 &&  i==j){
					
					return false;
							
					
				}
				if(matrix[i][j]!=0 && i!=j) {
					return false;
				}
			}
		}
		return true;
		
	}

}
