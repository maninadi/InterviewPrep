package DynamicProgramming;

import java.util.*;

public class NikitaGame {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int T=in.nextInt();
		for (int t=1;t<=T;t++){
			int N=in.nextInt();
			int[] a=new int[N];
			long total=0;
			for(int i=0;i<N;i++){
				a[i]=in.nextInt();
				total+=a[i];
			}
			//Arrays.sort(a);
			System.out.println(runOneTestCase(a,total));
		}
		in.close();
	}

	private static int runOneTestCase(int[] a,long total) {
		if(a.length==1)
			return 0;
		if((total%2)!=0)
			return 0;
		return BinarySearch(a,total/2,0,a.length-1);
	}

	private static int BinarySearch(int[] a, long total,int start,int end) {
		if(start>=end)
			return 0;
		long runningTotal=0;
		int i=0;
		for(i=start;i<=end;i++){
			runningTotal+=a[i];
			if(total==runningTotal)
				break;
		}
		if(i>end)
			return 0;
		
		int count=1;
		
		if((total%2)!=0)
			return count;
		
		count+=Math.max(BinarySearch(a,total/2,i+1,end),BinarySearch(a,total/2,start,i));
		
		return count;
	}

}
