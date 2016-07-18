package Implementation;

import java.util.*;

public class BeautifulTriplet {
	public static void main(String[] args) {
     
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		int d=in.nextInt();
		
		int[] a= new int[n];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		
		System.out.println(findPairs(a,d));
    }

	private static int findPairs(int[] a,int d) {
		int count=0;
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
			hs.add(a[i]);
		
		for(int i=0;i<a.length;i++){
			int a1=a[i];
			int a2=a1+d;
			int a3=a2+d;
			if(hs.contains(a1) && hs.contains(a2) && hs.contains(a3))
				count++;
			
		}
			
		
		
		return count;
	}
}
