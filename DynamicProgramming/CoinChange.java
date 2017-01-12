package DynamicProgramming;

import java.util.*;

public class CoinChange {

	public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int N=in.nextInt();
        int M=in.nextInt();
        Integer[] a=new Integer[M];
        for(int i=0;i<M;i++)
        	a[i]=in.nextInt();
        System.out.println(findWays(a,N));
    }
	
	private static long findWays(Integer[] a,int n){
		long[][] cache=new long[n+1][a.length+1];
		return findWays(a,0,n,cache);
	}

	private static long findWays(Integer[] a,int i,int n,long[][] cache) {
		if(cache[n][i]>0)
			return cache[n][i];
			
		if(i>a.length-1)
			if(n==0)
				return 1;
			else
				return 0;

		int coin=a[i];
		long count=0;
		
		for(int k=0;k*coin<=n;k++){
			int remainingAmt=n-(k*coin);
			if(remainingAmt>=0)
				count+=findWays(a,i+1,remainingAmt,cache);
		}
		cache[n][i]=count;
		return count;
	}
}
