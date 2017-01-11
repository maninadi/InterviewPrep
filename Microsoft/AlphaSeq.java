package Microsoft;

import java.util.*;

public class AlphaSeq {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		long n=in.nextLong();
		System.out.println(findString(n));
	}

	private static String findString(long n) {
		
		StringBuilder s = new StringBuilder();
		long i=n;
		
		int mod = (int) n%26;
		mod--;
		if(mod>0)s.append((char)('A'+(mod)));
		n-=mod;
		n/=26;
		while(n>0){
			s.append('Z');
			n/=26;
		}
		return s.toString();
	}
}
