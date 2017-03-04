package Arrays;

import java.util.*;

/*
 * Maximum size square sub-matrix with all 1s
	Given a binary matrix, find out the maximum size square sub-matrix with all 1s.
	
	For example, consider the below binary matrix.
	maximum-size-square-sub-matrix-with-all-1s
				   {{0, 1, 1, 0, 1}, 
                   {1, 1, 0, 1, 0}, 
                   {0, 1, 1, 1, 0},
                   {1, 1, 1, 1, 0},
                   {1, 1, 1, 1, 1},
                   {0, 0, 0, 0, 0}};
 */
public class MaxSquareInAGridWith0s1s {

	public static void main(String[] args){
		int[][] arr={{0, 1, 1, 0, 1}, 
                     {1, 1, 0, 1, 0}, 
                     {0, 1, 1, 1, 0},
                     {1, 1, 1, 1, 0},
                     {1, 1, 1, 1, 1},
                     {0, 0, 0, 0, 0}};
		
		System.out.println(maxSquare(arr));
	}

	private static int maxSquare(int[][] arr) {
		int max=0;
		
		for(int i=1;i<arr.length;i++){
			
			for(int j=1;j<arr[0].length;j++){
				
				if(arr[i][j]!=0){
				
					arr[i][j]=Math.min(arr[i-1][j-1], Math.min(arr[i-1][j], arr[i][j-1]));
					arr[i][j]++;
					max=Math.max(max, arr[i][j]);
				}
				
			}
		}
		return max*max;
	}
	
}
