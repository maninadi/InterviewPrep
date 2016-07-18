package DynamicProgramming;

import java.math.BigInteger;
import java.util.*;

public class FibModified {
	
		static HashMap<Integer,BigInteger> cache=new HashMap<Integer,BigInteger>();
	    public static void main(String[] args) {
	    	Scanner in=new Scanner(System.in);
	    	int A=in.nextInt();
	    	cache.put(1, new BigInteger(String.valueOf(A)));
	    	int B=in.nextInt();
	    	cache.put(2, new BigInteger(String.valueOf(B)));
	    	int N=in.nextInt();
	    	in.close();
	    	System.out.println(FindNth(N).toString());
	    }

		private static BigInteger FindNth(int n) {
			
			if(cache.containsKey(n))
				return cache.get(n);
			BigInteger value=FindNth(n-1);
			value=value.pow(2);
			value=value.add(FindNth(n-2));
			cache.put(n, value);
			return cache.get(n);
		}
}
