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
        	System.out.println(findMaxScore(a,0,true));
        }
        in.close();
    }

	private static int findMaxScore(int[] a,int i,boolean myTurn) {
		
		if(i>=a.length)
			return 0;
	
		int k1=Integer.MIN_VALUE;
		int k2=Integer.MIN_VALUE;
		int k3=Integer.MIN_VALUE;
		
		k1=a[i]+findMaxScore(a,i+1,!myTurn);
		if((i+1)<a.length) k2=k1+a[i+1]+findMaxScore(a,i+2,!myTurn);
		if((i+2)<a.length) k3=k3+a[i+2]+findMaxScore(a,i+3,!myTurn);
		
		return myTurn?Math.max(k1, Math.max(k2, k3)):0;
	}
}
