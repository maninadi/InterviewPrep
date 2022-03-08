package code22;

import java.util.Arrays;
import java.util.Scanner;

public class MatchingSets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int[] X=new int[n];
		int[] Y=new int[n];
		for(int i=0;i<n;i++)
			X[i]=in.nextInt();
		
		for(int i=0;i<n;i++)
			Y[i]=in.nextInt();
		
		in.close();
		Arrays.sort(X);
		Arrays.sort(Y);
		
		int low=0;
		int high=0;
		for(int i=0;i<n;i++){
			int k=(Y[i]-X[i]);;
			if(k<0)
				low+=k;
			else
				high+=k;
		}
		if((low+high)!=0)
			System.out.println(-1);
		else
			System.out.println(high);
    }
}
