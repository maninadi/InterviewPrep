package Arrays;

import java.util.*;

/*
 * Given two integers n and k, return all possible combinations of k numbers out of 1 2 3 ... n.

	Make sure the combinations are sorted.
	
	To elaborate,
	1. Within every entry, elements should be sorted. [1, 4] is a valid entry while [4, 1] is not.
	2. Entries should be sorted within themselves.
	
	Example :
	If n = 4 and k = 2, a solution is:
	
	[
	  [1,2],
	  [1,3],
	  [1,4],
	  [2,3],
	  [2,4],
	  [3,4],
	]
 */

public class NKCombinations {

	public static void main(String[] args){
		
		ArrayList<ArrayList<Integer>> res = combinations(4,2);
		
		for (ArrayList<Integer> r : res) {
			   for (Integer n : r) {
			       System.out.print(n + " "); 
			   }

			   System.out.println();
		}
	}
	
	static ArrayList<ArrayList<Integer>> combinations(int n, int k){
		
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		
		if(k>n)
			return res;
		
		getCombos(n,k,0,new ArrayList<Integer>(),res);
		
		return res;
		
	}

	private static void getCombos(int n, int k, int start, ArrayList<Integer> curr,
			ArrayList<ArrayList<Integer>> res) {
		
		if(k==0){
			res.add(new ArrayList<Integer>(curr));
			return;
		}
		
		for(int i=start+1;i<=n;i++ ){
			curr.add(i);
			getCombos(n,k-1,i,curr,res);
			curr.remove(curr.size()-1);
		}
	}
	
}
