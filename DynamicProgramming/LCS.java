package DynamicProgramming;

import java.util.*;

public class LCS {

	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[] A=new int[n];
        int[] B=new int[m];
        for(int i=0;i<n;i++){
            A[i]=in.nextInt();
        }
        for(int i=0;i<m;i++){
            B[i]=in.nextInt();
        }
        int[][] dp=getLCS(A,B);
        int i=n,j=m;
        ArrayList<Integer> res=new ArrayList<Integer>();
        while(i>0 && j>0){
        	if(A[i-1]==B[j-1]){
        		res.add(A[i-1]);
        		i--;j--;
        	}
        	else if(dp[i][j]==dp[i-1][j]){
        		i--;
        	}
        	else{
        		j--;
        	}
        }
        for(i=res.size()-1;i>=0;i--){
        	System.out.print(res.get(i)+" ");
        }
        	
        in.close();
    }
    
    static int[][] getLCS(int[] A,int[] B){
        int n=A.length+1;
        int m=B.length+1;
        int[][] dp=new int[n][m];
        
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(A[i-1]==B[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp;
    }
}
