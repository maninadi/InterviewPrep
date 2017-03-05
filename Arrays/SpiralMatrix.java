package Arrays;

import java.util.*;

/*
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

	For example,
	Given the following matrix:
	
	[
	 [ 1, 2, 3 ],
	 [ 4, 5, 6 ],
	 [ 7, 8, 9 ]
	]
	You should return [1,2,3,6,9,8,7,4,5].
 */
public class SpiralMatrix {

	public static void main(String[] args){
		
		int[][] arr={
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				//{13,14,15,16}
		};
		
		for(int i:spiralOrder(arr)){
			System.out.print(i+" ");
		}
	}
	
	static List<Integer> spiralOrder(int[][] matrix) {
        
        int r=0;
        int c=0;
		int n=matrix.length;
        int m=matrix[0].length;
        ArrayList<Integer> result=new ArrayList<Integer>();
        while(r<n && c<m){
            
            for(int j=c;j<m;j++){
                result.add(matrix[r][j]);
            }
            r++;
            
            for(int j=r;j<n;j++){
                result.add(matrix[j][m-1]);
            }
            m--;
            
            if(r<n){
            	for(int j=m-1;j>=c;j--){
                    result.add(matrix[n-1][j]);
                }
                n--;
            }
            if(c<m){
            	for(int j=n-1;j>=r;j--){
                    result.add(matrix[j][c]);
                }
                c++;	
            }
            
        }
        
        return result;
    }
}
