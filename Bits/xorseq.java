package Bits;

import java.math.BigInteger;
import java.util.Scanner;

public class xorseq {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int t=0;t<T;t++){
        	System.out.println(runtOneTestCase(in));
        }
        in.close();
		
        
    }

	private static long runtOneTestCase(Scanner in) {
        long L = in.nextLong();
        long R = in.nextLong();
    	return result(L-1)^result(R);
	}
	
	private static long result(long n) {
		if(n==0) return 0;
		long k=(n+1)/2;
		if(n%2==0){
			return compute(k)*2; 
		}
		else{
			return (compute(k-1)*2)^(k&1);
		}
	}

	private static long compute(long k) {
		long i=((k/4)*4);
		long result=0;
		for(;i<=k;i++){
			result^=i;
		}
		return result;
	}

	
}
