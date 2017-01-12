package Search;

import java.util.*;

public class CountPairs {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N=in.nextInt();
		int K=in.nextInt();
		int[] a=new int[N];
		for(int i=0;i<N;i++)
			a[i]=in.nextInt();
		QuickSort(a);
		System.out.println(search(a,N,K));
	}
	private static int search(int[] a,int N,int K) {
		int count=0;
		int left=0;
		int right=1;
		while((left<N)&&(right<N)){
			int diff=a[right]-a[left];
			if(diff<K)
				right++;
			else if(diff>K)
				left++;
			else {
				count++;
				right++;
			}
		}
		return count;
	}
	static void QuickSort(int[] ar){
		QuickSort(ar,0,ar.length-1);
	}
	
	static void QuickSort(int[] a,int start,int end){
		
		if(start>=end)
			return;
		int mid=(start+end)/2;
		int p=a[mid];
		int left=start;
		int right=end;
		while(left<=right){
			while(a[left]<p)
				left++;
			while(a[right]>p)
				right--;
			if(left>=right)
				break;
			int temp=a[left];
			a[left]=a[right];
			a[right]=temp;
			right--;
		}
		QuickSort(a, start, right);
		QuickSort(a, right+1, end);
	}
}
