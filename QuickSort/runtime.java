package QuickSort;

import java.util.Scanner;

public class runtime {

	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++){
			ar[i]=s.nextInt();
		}
		s.close();
		System.out.println(insertionSortPart2(ar.clone())- QuickSort(ar.clone()));
	}
	
	static int QuickSort(int[] ar){
		return QuickSort(ar,0,ar.length-1);
	}
	
	static int QuickSort(int[] a,int start,int end){
		
		if(start>=end)
			return 0;
		int p=a[end];
		int left=start;
		int right=start;
		int shifts=0;
		while(right<=end){
			if(a[right]<p){
				int temp=a[left];
				a[left]=a[right];
				a[right]=temp;
				left++;
				shifts++;
			}
			right++;
		}
		int temp=a[left];
		a[left]=p;
		a[end]=temp;
		shifts++;
		shifts+=QuickSort(a, start, left-1);
		shifts+=QuickSort(a, left+1, end);
		return shifts;
	}
	
	public static int insertionSortPart2(int[] ar)
	{   int shifts=0;    
		for(int i=1;i<ar.length;i++){
			shifts+=insertionSortPart1(ar,i);
		}
		return shifts;
	}  
	public static int insertionSortPart1(int[] ar,int n) {
    	int k=ar[n];
    	int i=n-1;
    	int shifts=0;
    	for(;i>=0;i--){
    		if(ar[i]>k){
    			ar[i+1]=ar[i];
    			shifts++;
    		}
    		else
    			break;
    	}
    	ar[i+1]=k;
    	return shifts;
	}
	
	
}
