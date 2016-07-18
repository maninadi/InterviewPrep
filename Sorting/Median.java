package Sorting;

import java.util.Scanner;

public class Median {

	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++){
			ar[i]=in.nextInt();
		}
		in.close();
		System.out.println(median(ar));
	}
	static int median(int[] ar){
		QuickSort(ar, 0, ar.length-1);
		return ar[ar.length/2];
	}
	static void QuickSort(int[] a,int start,int end){
		
		if(start>=end)
			return;
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
		QuickSort(a, start, left-1);
		QuickSort(a, left+1, end);
	}
}
