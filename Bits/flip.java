package Bits;

import java.math.BigInteger;
import java.util.Scanner;

public class flip {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int T=in.nextInt();
		long k=(long)Math.pow(2, 32)-1;
		for(int i=1;i<=T;i++){
			long n=in.nextLong();
			System.out.println(k-n);
		}
    }
}
