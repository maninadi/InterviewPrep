package Arrays;

/*
 * You are given 3 arrays A, B and C. All 3 of the arrays are sorted.

	Find i, j, k such that :
	max(abs(A[i] - B[j]), abs(B[j] - C[k]), abs(C[k] - A[i])) is minimized.
	Return the minimum max(abs(A[i] - B[j]), abs(B[j] - C[k]), abs(C[k] - A[i]))
	
	**abs(x) is absolute value of x and is implemented in the following manner : **
	
	      if (x < 0) return -x;
	      else return x;
	Example :
	
	Input : 
	        A : [1, 4, 10]
	        B : [2, 15, 20]
	        C : [10, 12]
	
	Output : 5 
	         With 10 from A, 15 from B and 10 from C.
 */

import java.util.*;

public class MinDisIn3Arrays {

	public static void main(String[] args){
		
		
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		Collections.addAll(a, 1, 4, 10);
		ArrayList<Integer> b=new ArrayList<Integer>();
		Collections.addAll(b, 2, 15, 20);
		ArrayList<Integer> c=new ArrayList<Integer>();
		Collections.addAll(c, 10, 12);
		
		System.out.println(minDis(a,b,c));
	}
	
	
	static int minDis(ArrayList<Integer> a,
			ArrayList<Integer> b,
			ArrayList<Integer> c){
		
		
		int minDis=Integer.MAX_VALUE;
		
		int i=0;
		int j=0;
		int k=0;
		
		
		while(i<a.size() && j<b.size() && k<c.size()){
			
			int min=Math.min(a.get(i), Math.min(b.get(j),c.get(k)));
			int max=Math.max(a.get(i), Math.max(b.get(j),c.get(k)));
			
			if(minDis>Math.abs(max-min)){
				minDis=Math.abs(max-min);
			}
			
			if(minDis==0)
				return 0;
			if(a.get(i)==min)
				i++;
			else if(b.get(j)==min)
				j++;
			else
				k++;
		}
		
		
		return minDis;
	}
	
}
