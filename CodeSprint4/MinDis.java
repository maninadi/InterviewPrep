package CodeSprint4;

import java.util.*;

public class MinDis {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int A[] = new int[n];
	        for(int A_i=0; A_i < n; A_i++){
	            A[A_i] = in.nextInt();
	        }
	        in.close();
	        System.out.println(findMinD(A));
	    }

	private static int findMinD(int[] a) {
		
		int diff=Integer.MAX_VALUE;
		HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++){
			if(hm.containsKey(a[i])){
				int s=hm.get(a[i]);
				if(diff>(i-s))
					diff=i-s;
				hm.remove(a[i]);
				hm.put(a[i], i);
			}
			else
				hm.put(a[i], i);
			
		}
		
		return diff==Integer.MAX_VALUE?-1:diff;
	}
}
