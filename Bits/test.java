package Bits;

import java.math.BigInteger;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		for(int t=1;t<=127;t++){
        	runtOneTestCase(t);
        }
		
        
    }

	private static long runtOneTestCase(int R) {
        long result=0;
        for(long i=1;i<=R;i++){
        	result^=pick(i);
        }
        System.out.println(R+"  "+pick(R)+"  "+result);
		return result;
	}
	
	private static long pick(long n){
		switch((int)n%4){
		case 1:
			return 1;
		case 2:
			return n+1;
		case 3:
			return 0;
		case 0:
			return n;
		}
		return -1;
	}
	
}
