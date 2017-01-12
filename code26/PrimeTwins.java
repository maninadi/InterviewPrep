package code26;

import java.math.*;
import java.util.*;

public class PrimeTwins {
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		in.close();
		
		boolean[] a=genPrime(m,n);
		System.out.println(countPrime(a,m));
	}
	
	
	private static int countPrime(boolean[] a,int m) {
		int count=0;
		for(int i=0;i<a.length-2;i++){
			if(a[i] && a[i+2])
				count++;
		}
		return count;
	}


	private static boolean[] genPrime(int m,int n) {
		
		boolean[] a=primeHelper(m);
		boolean[] b=new boolean[n-m+1];
		Arrays.fill(b,true);
		int k=m;
		
		for(int i=2;i<m;i++){
			if(a[i]){
				while(k<n){
					
					if(k%i==0)
						b[k-m]=false;

					k+=i;
				}
				k=m;
			}
		}
		
		
		return b;
	}
	
	private static boolean[] primeHelper(int k){
		boolean[] a=new boolean[k+1];
		Arrays.fill(a,true);
		a[0]=a[1]=false;
		int i=2;
		while(i<k){
			skipNonPrime(a,i);
			i=getNextI(a,i+1);
		}
		return a;
	}

	private static void skipNonPrime(boolean[] a, int i) {
		for(int j=i;j<a.length;j+=i)
			a[j]=false;
		
	}

	private static int getNextI(boolean[] a, int i) {
		while(!a[i])
			i++;
		return i;
	}

}
	
	