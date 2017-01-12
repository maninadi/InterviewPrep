package Java;

import java.util.*;

public class OneDArray2 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int n=in.nextInt();
			int m=in.nextInt();
			int[] a=new int[n];
			for(int j=0;j<n;j++){
				a[j]=in.nextInt();
			}
			System.out.println(analyze(a,m));
		}
		
		in.close();
    }

	private static String analyze(int[] a, int m) {
		HashMap<Integer,Boolean> hm= new HashMap<Integer,Boolean>(); 
		return analyze(a,m,0,hm)?"YES":"NO";
	}

	private static boolean analyze(int[] a, int m, int i,HashMap<Integer,Boolean> hm) {
		if(i>=a.length)
			return true;
		
		if(i<0||a[i]==1){
			hm.put(i, false);
			return false;
		}
		
		if(hm.containsKey(i))
			return hm.get(i); 
		
		hm.put(i, false);
		
		boolean ret=(analyze(a,m,i+1,hm)||analyze(a,m,i+m,hm)||analyze(a,m,i-1,hm));	
		hm.put(i, ret);
		return ret;
	}
}
