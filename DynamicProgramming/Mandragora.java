package DynamicProgramming;

import java.util.*;

public class Mandragora {
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		
		for(int i=1;i<=T;i++){
			
			int n=in.nextInt();
			int[] arr=getArr(in,n);
			System.out.println(solve(arr,n));
		}
		
		in.close();
	}

	private static long solve(int[] arr, int n) {
		long p=0;
		long runningSum=0;
		Arrays.sort(arr);
		for(int i=n-1;i>=0;i--){
			runningSum+=arr[i];
			
			p=(long)Math.max(p, runningSum*(i+1));
		}
		return p;
	}

	private static int[] getArr(Scanner in,int n) {
		
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		return arr;
	}

}
