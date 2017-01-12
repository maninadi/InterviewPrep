package Implementation;

import java.math.*;
import java.util.*;

public class ExtraLongFac {

	public static void main(String[] args) {
    
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		System.out.println(fact(BigInteger.valueOf(n)).toString());
    }

	private static BigInteger fact(BigInteger n) {
		if(n.compareTo(BigInteger.ONE)==0 || n.compareTo(BigInteger.ZERO)==0)
			return BigInteger.ONE;
		
		return n.multiply(fact(n.subtract(BigInteger.ONE)));

	}
}
