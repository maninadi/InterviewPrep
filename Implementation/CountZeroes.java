package Implementation;



/*
 * Given an integer n, return the number of trailing zeroes in n!.

	Note: Your solution should be in logarithmic time complexity.
	
	Example :
	
	n = 5
	n! = 120 
	Number of trailing zeros = 1
	So, return 1
 */

public class CountZeroes {

	public static void main(String[] args){
		
		System.out.println(countZeroes(5));
	}
	
	static int countZeroes(int n){
		
		int count=0;
		for(int i=5;i<=n;i*=5){
			count+=(n/i);
		}
		
		return count;
	}
	
	
}
