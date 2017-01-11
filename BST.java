

import java.util.*;
public class BST {

	public static void main(String args[] ) throws Exception {
	 
		int[] e={1,2,3,4,5,6};
		
		System.out.println(ss(e,3));
		
	}
	
	static int ss(int[] elements,int t){
		if(elements==null ||elements.length<=0) return -1;
		int l=0,r=elements.length-1;
		while(l<r){
			int m=(l+r)/2;
			if(elements[m]>t)
				r=m-1;
			else
				l=m+1;
		}
		
		if(elements[r]==t) return r; 
		return -1;
	}

}


