package vmware;

import java.util.*;

public class BSTCheck {

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		
		System.out.println(isBST(a));
		in.close();
	}
	
	static boolean isBST(int[] a){
		return isBST(a,0,a.length-1);
	}
	static boolean isBST(int[] a,int i,int j){
		if(j-i<=1)
			return true;
		int mid=i;
		while(mid<=j && a[mid]<=a[j])
			mid++;
		if(mid>=j)
			return true;
		int itr=mid+1;
		while(itr<=j && a[itr]>a[j])
			itr++;
		if(itr!=j)
			return false;
		
		return isBST(a,i,mid)&&isBST(a,mid+1,j-1);
	}
}
