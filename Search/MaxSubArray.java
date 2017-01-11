package Search;

import java.math.BigInteger;
import java.util.Scanner;

public class MaxSubArray {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 int T=in.nextInt();
		 for(int i=1;i<=T;i++){
			System.out.println(runOneTestCase(in)) ;
		 }
	 }

	private static long runOneTestCase(Scanner in) {
		int N=in.nextInt();
		int M=in.nextInt();
		long[] a=new long[N];
		for(int i=0;i<N;i++){
			a[i]=in.nextLong();
			a[i]%=M;
		}
		return findSubArray(a,M);
	}

	private static long findSubArray(long[] a, int M) {

		long total=0;
		
		for(int i=0;i<a.length;i++){
			
			if(total<=0){
				total=0;
			}else{
				total+=a[i];
			}
			
		}
		
		return total;
	}
	

}
