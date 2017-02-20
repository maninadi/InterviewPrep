package Strings;

/*
 * Find the minimum number of insertions to convert a string to a palindrome
 * 
 * Example abcde needs 4 insertions edcbabcde to make it a palindrome
 */


public class MinimumInsertions {

	public static void main(String[] args){
		
		System.out.println(recursive("abcde"));
		
		System.out.println(dpLCS("abcde"));
	}
	
	static int dpLCS(String s){
		
		String strRev= new StringBuilder(s).reverse().toString();
		
		int n=s.length();
		int[][] lcs=new int[n+1][n+1];
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(s.charAt(i-1)==strRev.charAt(j-1)){
					lcs[i][j]=lcs[i-1][j-1]+1;
				}
				else{
					
					lcs[i][j]=Math.max(lcs[i-1][j],lcs[i][j-1]);
				}
					
			}
		}
		
		return n-lcs[n][n];
	}
	
	
	static int recursive(String s){
		
		return recursive(s,0,s.length()-1); 
	}
	
	static int recursive(String s,int start,int end){
		
		if(start>end)
			return Integer.MAX_VALUE;
		
		if(start==end)
			return 0;
		
		if(start==end-1)
			return s.charAt(start)==s.charAt(end)?0:1;
		
		return s.charAt(start)==s.charAt(end)?recursive(s,start+1,end-1):
			Math.min(recursive(s,start+1,end), recursive(s,start,end-1))+1;
	}
}
