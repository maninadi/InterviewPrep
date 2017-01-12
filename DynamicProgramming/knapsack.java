package DynamicProgramming;

import java.util.*;

public class knapsack {
   
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T=in.nextInt();
		for(int i=1;i<=T;i++){
			int n=in.nextInt();
			int k= in.nextInt();
			int[] a=new int[n];
			for(int j=0;j<n;j++)
				a[j]=in.nextInt();
			HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
			hm.put(0, 0);
			System.out.println(findClosestNum(a,k,hm ));
			
		}
		
    }

	private static int findClosestNum(int[] a,int k,HashMap<Integer,Integer> hm) {
		int closest=0;
		if(hm.containsKey(k))
			return hm.get(k);
		for(int i=0;i<a.length;i++){
			if(k%a[i]==0)
				return k;
			int temp = closest+a[i];
			if(temp<=k && temp>closest){
				closest+=a[i];
				closest =Math.max(closest,closest+findClosestNum(a,k-closest,hm));
			}
			if(a[i]<=k)
				closest=Math.max(closest,a[i]+findClosestNum(a,k-a[i],hm));
		}
		hm.put(k, closest);
		return closest;
	}
}
