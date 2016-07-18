package Bits;

import java.io.FileReader;
import java.math.BigInteger;
import java.util.Scanner;

public class ninja {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		try{
		Scanner in = new Scanner(new FileReader("C:\\D\\MyPath\\xorninja1.txt"));
		int T=in.nextInt();
		for(int t=1;t<=T;t++){
			int n=in.nextInt();
			long[] ar=new long[n];
			for(int i=0;i<n;i++)
				ar[i]=in.nextLong();
			System.out.println(runTestCase(ar));
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		
    }

	private static String runTestCase(long[] ar) {
		int n=ar.length;
		BigInteger appearance= BigInteger.ONE;
		appearance=appearance.shiftLeft(n-1);

		BigInteger  k= BigInteger.ZERO;
		int i=0;
		int j=ar.length-1;
		BigInteger moval=BigInteger.valueOf(1000000000+7);
		while(i<=j){
			k=k.or(appearance.multiply(BigInteger.valueOf(ar[i]).mod(moval)));
			k=k.or(appearance.multiply(BigInteger.valueOf(ar[j]).mod(moval)));
			i++;
			j--;
		}
		return k.toString();
	}
}
