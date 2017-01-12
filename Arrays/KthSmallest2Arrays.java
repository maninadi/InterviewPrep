package Arrays;

import java.util.*;

public class KthSmallest2Arrays {

	public static void main(String[] args){
	      int input1[] = {1,5,7,11,17,21};
	        int input2[] = {-4,-1,3,4,6,28,35,41,56,70};
	        for(int i = 0; i < input1.length + input2.length; i++){
	            System.out.println(findKthSmallest(input1, input2, i+1));
	        }
	}
	
	private static int findKthSmallest(int[] input1, int[] input2, int i) {
		return findKthSmallest(input1,0,input1.length, input2, 0,input2.length,i);
	}

	static int findKthSmallest(int[] A,int low1, int m,int[] B,int low2, int n,int k){
			  
		  int i = (int)((double)m / (m+n) * (k-1));
		  int j = (k-1) - i;
		 
		  int Ai_1 = ((i == 0) ? Integer.MIN_VALUE : A[i-1]);
		  int Bj_1 = ((j == 0) ? Integer.MIN_VALUE: B[j-1]);
		  int Ai   = ((i == m) ? Integer.MAX_VALUE : A[i]);
		  int Bj   = ((j == n) ? Integer.MAX_VALUE: B[j]);
		 
		  if (Bj_1 < Ai && Ai < Bj)
		    return Ai;
		  else if (Ai_1 < Bj && Bj < Ai)
		    return Bj;
		 
		  if (Ai < Bj)
		    return findKthSmallest(A, i+1, m-i-1, B, low2, j, k-i-1);
		  else 
		    return findKthSmallest(A,low1, i, B,j+1, n-j-1, k-j-1);
	}
}
