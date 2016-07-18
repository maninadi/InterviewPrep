package QuickSort;

import java.util.ArrayList;
import java.util.Scanner;

public class QuickSort1 {
	
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++){
			ar[i]=s.nextInt();
		}
		s.close();
		ar=QuickSortPartition(ar,0,n-1);
		printArray(ar);
	}
	
	static int[] QuickSortPartition(int[] a,int start,int end){
		
		if(start>=end)
			return a;
		int p=a[end];
		int left=start;
		int right=start;
		while(right<=end){
			if(a[right]<p){
				int temp=a[left];
				a[left]=a[right];
				a[right]=temp;
				left++;
			}
			right++;
		}
		int temp=a[left];
		a[left]=p;
		a[end]=temp;
		printArray(a);
		a=QuickSortPartition(a, start, left-1);
		a=QuickSortPartition(a, left+1, end);
		
		return a;
	}
	
	private static void printArray(int[] ar) {
		for(int n: ar){
			System.out.print(n+" ");
		}
		System.out.println("");
	}
}
