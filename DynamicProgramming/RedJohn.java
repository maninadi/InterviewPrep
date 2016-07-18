package DynamicProgramming;

import java.util.*;

public class RedJohn {
	
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        for(int i=0;i<T;i++)
        	System.out.println(runTestCase(in));
    }

	private static int runTestCase(Scanner in) {
		
		int N=in.nextInt();
		return countPrime(findCombo(N));
	}

	private static int findCombo(int n) {
		int[] cache=new int[n+1];
		return findCombo(n,cache);
	}
	
	private static int findCombo(int n,int[] cache) {
		if(cache[n]>0)
			return cache[n];
			
		if(n<4)
			return 1;
		
		cache[n]=findCombo(n-1)+findCombo(n-4);
		
		return cache[n];

	}

	private static int countPrime(int combo) {
		boolean[] a=new boolean[combo+1];
		Arrays.fill(a,true);
		a[0]=a[1]=false;
		
		int i=2;
		while(i<=Math.sqrt(combo)){
			
			skipNonPrime(a,i);
			
			i=getNextI(a,i+1);
		}
		int count=0;
		for(int j=0;j<a.length;j++){
			if(a[j])
				count++;
		}
		return count;
	}

	private static void skipNonPrime(boolean[] a, int i) {
		for(int j=(int)Math.pow(i, 2);j<a.length;j+=i)
			a[j]=false;
		
	}

	private static int getNextI(boolean[] a, int i) {
		while(!a[i])
			i++;
		return i;
	}

}
