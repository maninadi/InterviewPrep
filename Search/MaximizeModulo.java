package Search;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MaximizeModulo {

	 public static void main(String[] args) throws FileNotFoundException {
		 Scanner in = new Scanner(new FileReader("C:\\D\\MyPath\\maxMod1.txt")); //System.in);
		 int T=in.nextInt();
		 for(int i=1;i<=T;i++){
			System.out.println(runOneTestCase(in)) ;
		 }
	 }

	private static long runOneTestCase(Scanner in) {
		long N=in.nextLong();
		long M=in.nextLong();
		long[] a=new long[(int)N];
		for(int i=0;i<N;i++){
			a[i]=in.nextLong();
		}
		return findSubArray(a,M);
	}

	private static long findSubArray(long[] a, long M) {

		return BinarySearch(a,M,0,a.length-1);
	}

	private static long BinarySearch(long[] a, long m, long i, long j) {
		if(i>=j)
			return a[(int)i]%m;
		int mid=(int)(i+j)/2;
		long left=BinarySearch(a, m, i, mid-1);
		long right=BinarySearch(a, m, mid+1,j);
		
		long lSum=Integer.MIN_VALUE;
		long sum=0;
		for(int l=mid;l>=0;l--){
			sum+=a[l];
			if(lSum<sum)
				lSum=sum;
		}
		long rSum=Integer.MIN_VALUE;
		sum=0;
		for(int l=mid+1;l<=j;l++){
			sum+=a[l];
			if(rSum<sum)
				rSum=sum;
		}
		sum=(lSum+rSum);
		sum%=m;
		left%=m;
		right%=m;
		return Math.max(sum,Math.max(left,right));
	}
	
}
