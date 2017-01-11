package codeSprint7;

import java.math.BigInteger;
import java.util.*;

public class SummingPieces {

	static long denom=0;
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		in.close();
		long sum=0;
		denom=(long)(Math.pow(10, 9)+7);
		BigInteger N=BigInteger.valueOf(2);
		BigInteger I=BigInteger.ONE;
		N=N.pow(a.length);
		N=N.subtract(BigInteger.ONE);
		while(N.compareTo(BigInteger.ZERO)>0){
			sum+=findSum(a, N);
    		N=N.xor(I);
    		I=I.shiftLeft(1);
    	}
		sum+=findSum(a, BigInteger.ZERO);
		System.out.println(sum);
	}

	private static long findSum(int[] a, BigInteger i) {
		long result1=0,result0=0;
		long k1=0,k2=0,j=0;
		if(i!=BigInteger.ZERO){
			String s=i.toString(2);
			for(char c:s.toCharArray()){
				if(c=='1'){
					result1+=a[(int) j];
					k1++;
				}
				else{
					result0+=a[(int) j];
					k2++;
				}
				j++;	
			}
			result1=result1%denom;
			result0=result0%denom;
			return (result1*k1)+(result0*k2);
		}
		for(j=0;j<a.length;j++)
			result0=((result0+a[(int) j])%denom);
		
		return result0;
	}
}
