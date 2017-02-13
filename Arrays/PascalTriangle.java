package Arrays;

import java.util.*;

/*
 * Given numRows, generate the first numRows of Pascal’s triangle.

	Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.
	
	Example:
	
	Given numRows = 5,
	
	Return
	
	[
	     [1],
	     [1,1],
	     [1,2,1],
	     [1,3,3,1],
	     [1,4,6,4,1]
	]
 */

public class PascalTriangle {

	public static void main(String[] args){
	
		ArrayList<ArrayList<Integer>> res= pascals(5);
		for(ArrayList<Integer> a:res){
			
			for(int k:a){
				System.out.format("%d ",k);
			}
			System.out.println();
		}
	}
	
	static ArrayList<ArrayList<Integer>> pascals(int n){
		
		
		ArrayList<ArrayList<Integer>> res= new ArrayList<ArrayList<Integer>>();
		
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		res.add(new ArrayList<Integer>(a));
		n--;
		while(n>0){
			ArrayList<Integer> b=new ArrayList<Integer>();
			for(int i=0;i<=a.size();i++){
				int c1=i-1<0?0:a.get(i-1);
				int c2=i>=a.size()?0:a.get(i);
				b.add(c1+c2);
			}
			a=b;
			res.add(b);
			n--;
		}
		
		return res;
	}
}
