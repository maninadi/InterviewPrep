package Arrays;

import java.util.*;

/*
 * Given a collection of numbers, return all possible permutations.

	Example:
	
	[1,2,3] will have the following permutations:
	
	[1,2,3]
	[1,3,2]
	[2,1,3] 
	[2,3,1] 
	[3,1,2] 
	[3,2,1]
	NOTE
	
	No two entries in the permutation sequence should be the same.
	For the purpose of this problem, assume that all the numbers in the collection are unique.
 */

public class ArrayPermutations {

	public static void main(String[] args){
		
		Integer[] vals={1,2,3,4};
		ArrayList<Integer> a=new ArrayList<Integer>(Arrays.asList(vals));
		
		ArrayList<ArrayList<Integer>> res=permute(a);
		
		for (ArrayList<Integer> r : res) {
			   for (Integer n : r) {
			       System.out.print(n + " "); 
			   }

			   System.out.println();
		}
		
	}
	
	static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
	    
	    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	    
	    getPerms(a.size(),a,new ArrayList<Integer>(),res);
	    
	    return res;
	}
	
	static void getPerms(int n,ArrayList<Integer> a,ArrayList<Integer> prefix,
	        ArrayList<ArrayList<Integer>> res){
	    
	    if(prefix.size()==n){
	        res.add(new ArrayList<Integer>(prefix));
	        return;
	    }
	    
	    for(int i=0;i<a.size();i++){
	        
	        prefix.add(a.get(i));
	        a.remove(i);
	        getPerms(n,a,prefix,res);
	        a.add(i,prefix.get(prefix.size()-1));
	        prefix.remove(prefix.size()-1);
	        
	    }
	    
	}
}
