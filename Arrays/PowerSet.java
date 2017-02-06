package Arrays;

import java.util.*;

/*
 * Given a collection of integers that might contain duplicates, S, return all possible subsets.
	
	Note:
	
	Elements in a subset must be in non-descending order.
	The solution set must not contain duplicate subsets.
	The subsets must be sorted lexicographically.
	Example :
	If S = [1,2,2], the solution is:
	
	[
	[],
	[1],
	[1,2],
	[1,2,2],
	[2],
	[2, 2]
	]
 */
public class PowerSet {

	public static void main(String[] args){
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(9);
		
		ArrayList<ArrayList<Integer>> res=subsetsWithDup(a);
		
		for(int i=0;i<res.size();i++){
			System.out.println(res.get(i));
		}
	}
	
	static ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> a) {
		
		ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
		
		int n=a.size();
		
		int totalCombo=(int) Math.pow(2, n);
		
		HashSet<String> uniques=new HashSet<String>();
		
		for(int i=0;i<totalCombo;i++){
			
			ArrayList<Integer> lst=getSubset(a,i,uniques);
			if(lst!=null)
				res.add(lst);
		}
		
		return res;
	}

	private static ArrayList<Integer> getSubset(ArrayList<Integer> a, int i, HashSet<String> uniques) {
		
		ArrayList<Integer> r=new ArrayList<Integer>();
		int j=0;
		String s="";
		int n=a.size()-1;
		while(i>0){
			if((i&1)==1){
				s+=a.get(j);
				r.add(a.get(j));
			}
			i>>=1;
			j++;
		}
		
		if(!uniques.contains(s)){
			uniques.add(s);
			return r;
		}
			
		return null;
	}
	
	
}
