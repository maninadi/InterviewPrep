package Strings;

import java.util.*;

public class CommonChild {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        System.out.println(findLongestCommonSeq(s1,s2));
    }

	private static int findLongestCommonSeq(String s1, String s2) {
		int m=s1.length();
		int n=s2.length();
		int[][] seq=new int[m+1][n+1];
		for(int i=0;i<seq.length;i++)
			seq[i][0]=0;
		for(int i=0;i<seq[0].length;i++)
			seq[0][i]=0;
		
		for(int i=1;i<seq.length;i++){
		
			for(int j=1;j<seq[0].length;j++){
				if(s1.charAt(i-1)==s2.charAt(j-1)){
					seq[i][j]=seq[i-1][j-1]+1;
				}
				else{
					seq[i][j]=Math.max(seq[i-1][j], seq[i][j-1]);
				}
			}
		}
		
		return seq[m][n];
	}
}
