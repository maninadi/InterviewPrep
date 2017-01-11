package DynamicProgramming;

import java.io.*;
import java.util.*;

public class BricksGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        for(int i=0;i<T;i++){
        	int N=in.nextInt();
        	int[] a=new int[N];
        	for(int j=0;j<N;j++)
        		a[j]=in.nextInt();
        	System.out.println(findMaxScore(a));
        }
        in.close();
    }

	private static int findMaxScore(int[] a) {
		
		int[] dp=new int[a.length+3];
		int runningSum=0;
		for(int i=a.length-1;i>=0;i--){
			runningSum+=a[i];
			dp[i]=runningSum-Math.min(Math.min(dp[i+1], dp[i+2]), dp[i+3]);
		}
		return dp[0];
	}
}
