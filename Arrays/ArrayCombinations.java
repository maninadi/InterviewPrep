package Arrays;


/*
 * Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

	The same repeated number may be chosen from C unlimited number of times.
	
	Note:
	
	All numbers (including target) will be positive integers.
	Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 <= a2 <= … <= ak).
	The combinations themselves must be sorted in ascending order.
	CombinationA > CombinationB iff (a1 > b1) OR (a1 = b1 AND a2 > b2) OR … (a1 = b1 AND a2 = b2 AND … ai = bi AND ai+1 > bi+1)
	The solution set must not contain duplicate combinations.
	Example, 
	Given candidate set 2,3,6,7 and target 7,
	A solution set is:
	
	[2, 2, 3]
	[7]
 */
import java.util.*;

public class ArrayCombinations {

	
	public static void main(String[] args){
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(2);
		a.add(3);
		a.add(6);
		a.add(7);
		
		ArrayList<ArrayList<Integer>> res=combinationSum(a,7);
		
		for (ArrayList<Integer> r : res) {
			   for (Integer n : r) {
			       System.out.print(n + " "); 
			   }

			   System.out.println();
		}
	}
	
	
	
	static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
	    
	    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	    
	    
	    if(a!=null || a.size()>0){
	        
	        Collections.sort(a);
	        
	        ArrayList<Integer> uniques=new ArrayList<Integer>();
	        uniques.add(a.get(0));
    	    for (int i = 0; i < a.size(); i++) {
    	        if (i != 0 && a.get(i) != a.get(i - 1))
    	            uniques.add(a.get(i));
    	    }
	        helper(uniques,b,new ArrayList<Integer>(),res,0);
	    }
	    
	    return res;
	}
	
	static void helper(ArrayList<Integer> a, int b,ArrayList<Integer> curr,ArrayList<ArrayList<Integer>> res,
	int index){
	    
	    if(b==0){
	        res.add(new ArrayList<Integer>(curr));
	        return;
	    }
	    
	    if(b<0){
	        return;
	    }
	    
	    for(int i=index;i<a.size();i++){
	        curr.add(a.get(i));
	        helper(a,b-a.get(i),curr,res,i);
	        curr.remove(curr.size()-1);
	        
	    }
	}
}
