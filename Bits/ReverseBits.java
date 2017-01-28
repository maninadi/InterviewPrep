package Bits;

/*
 * Reverse bits of an 32 bit unsigned integer
	
	Example 1:
	x = 0,
	          00000000000000000000000000000000  
	=>        00000000000000000000000000000000
	return 0
	Example 2:
	x = 3,
	          00000000000000000000000000000011 
	=>        11000000000000000000000000000000
	return 3221225472
	Since java does not have unsigned int, use long
 */


public class ReverseBits {

	public static void main(String[] args){
		
		System.out.println(Long.toBinaryString(3));
		System.out.println(Long.toBinaryString(reverse(3)));
		System.out.println("");
		
		System.out.println(Long.toBinaryString(11));
		System.out.println(Long.toBinaryString(reverse(11)));
		System.out.println("");
		
		System.out.println(Long.toBinaryString(32657));
		System.out.println(Long.toBinaryString(reverse(32657)));
		System.out.println("");
	}
	
	static long reverse(long a) {
	    
	    int i=1;
	    long mask=1;
	    long out=0;
	    while(i<32){
	        out|=(a&mask);
	        out<<=1;
	        a>>=1;
	        i++;
	    }
	    
	    return out|a;
	    
	}
	
}
