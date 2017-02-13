package Arrays;

import java.util.*;

/*
 * Given a non-negative number represented as an array of digits,
	
	add 1 to the number ( increment the number represented by the digits ).
	
	The digits are stored such that the most significant digit is at the head of the list.
	
	Example:
	
	If the vector has [1, 2, 3]
	
	the returned vector should be [1, 2, 4]
	
	as 123 + 1 = 124.
	
	NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer.
	For example, for this problem, following are some good questions to ask :
	
	Q : Can the input have 0’s before the most significant digit. Or in other words, is 0 1 2 3 a valid input?
	A : For the purpose of this question, YES
	Q : Can the output have 0’s before the most significant digit? Or in other words, is 0 1 2 4 a valid output?
	A : For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.
 */
public class PlusOne {

	public static void main(String[] args){
		
		ArrayList<Integer> a=new ArrayList<Integer> ();
		a.add(0);
		a.add(9);
		a.add(9);
		for(int i:plusOne(a)){
			System.out.format("%d ",i);
		}
	}
	
	static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
		
		boolean skipZeroes=true;
		
		ArrayList<Integer> res=new ArrayList<Integer>();
		int i=a.size()-1;
		int r=0;
		int c=1;
		while(i>=0){
			r=a.get(i)+c;
			a.set(i, r%10);
			c=r/10;
			i--;
		}
		
		if(c>0){
			a.add(0,c);
		}
		
		for(int k:a){
			if(k==0 && skipZeroes)
				continue;
			skipZeroes=false;
			res.add(k);
		}

		return res;
	}
	
}
