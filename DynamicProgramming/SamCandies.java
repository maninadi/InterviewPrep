package DynamicProgramming;


import java.io.*;
import java.math.*;
import java.util.*;

public class SamCandies {

	static BigInteger denom=BigInteger.valueOf(1000000007);
	static BigInteger big10=BigInteger.valueOf(10);
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String S=in.next();
        System.out.println(calcCandies(S));
        in.close();
    }

	private static long calcCandies(String s) {
		if(s.length()==0)
			return 0;
		BigInteger res=BigInteger.ZERO;
		BigInteger freq=BigInteger.ONE;
		
		for(int i=s.length()-1;i>=0;i--){
			int digit=s.charAt(i)-'0';
			BigInteger val=BigInteger.valueOf(digit*(i+1));
			val=freq.multiply(val);
			res=res.add(val);
			freq=freq.multiply(big10).add(BigInteger.ONE);
		}
		
		return res.mod(denom).longValue();
	}
}
