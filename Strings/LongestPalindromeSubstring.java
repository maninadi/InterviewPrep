package Strings;

public class LongestPalindromeSubstring {

	public static void main(String[] args){
		
		System.out.println(findMaxLength("forgeeksskeegraf"));
	}
	
	static int findMaxLength(String s){
		
		int n=s.length();
		boolean[][] lps=new boolean[n][n];
		int maxLen=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++)
			lps[i][i]=true;
		
		for(int i=0;i<n-1;i++){
			if(s.charAt(i)==s.charAt(i+1)){
				lps[i][i+1]=true;
				maxLen=2;
			}
		}
		
		for(int k=3;k<=n;k++){
			
			for(int i=0;i<=n-k;i++){
				
				int j=i+k-1;
				
				if(lps[i+1][j-1] && s.charAt(i)==s.charAt(j)){
					
					lps[i][j]=true;
					maxLen=Math.max(maxLen, k);
				}
			}
		}
		
		return maxLen;
	}
}
	