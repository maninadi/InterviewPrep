package Arrays;

import java.util.*;

public class NullifyMatrix {

	public static void main(String[] args){
		
		int[][] m={
				{0,1,1,1},
				{1,1,1,1},
				{1,1,1,1},
				{1,1,1,1}
				};
		
		setZeroes(m);
		
		for(int[] a:m){
			System.out.println(Arrays.toString(a));
		}
	}
	
	static void setZeroes(int[][] matrix) {
        
        boolean firstRowHasZero=false;
        boolean firstColumnHasZero=false;
        for(int i=0;i<matrix[0].length;i++){
            if(matrix[0][i]==0){
                firstRowHasZero=true;
                break;
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]==0){
                firstColumnHasZero=true;
                break;
            }
        }
        
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        
        for(int i=1;i<matrix[0].length;i++){
            if(matrix[0][i]==0)
                resetCol(matrix,i);
        }
        
        for(int i=1;i<matrix.length;i++){
            if(matrix[i][0]==0)
                resetRow(matrix,i);
        }
        
        if(firstRowHasZero) resetRow(matrix,0);
        
        if(firstColumnHasZero) resetCol(matrix,0);
        
    }
    
    static void resetRow(int[][] matrix,int row){
        
        for(int i=0;i<matrix[row].length;i++){
            matrix[row][i]=0;
        }
    }
    
    static void resetCol(int[][] matrix,int col){
        
        for(int i=0;i<matrix.length;i++){
            matrix[i][col]=0;
        }
    }
}
