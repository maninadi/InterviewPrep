package QuickSort;

import java.util.ArrayList;
import java.util.Scanner;

public class QuickSort2 {
	
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Integer[] ar=new Integer[n];
		for(int i=0;i<n;i++){
			ar[i]=s.nextInt();
		}
		s.close();
		ar=QuickSortPartition(ar);
		printArray(ar);
	}
	
	static Integer[] QuickSortPartition(Integer[] ar){
		
		if(ar.length<=1)
			return ar;
		ArrayList<Integer> left=new ArrayList<Integer>(); 
		ArrayList<Integer> right=new ArrayList<Integer>();
		int p=ar[0];
		int index=0;
		for(int i=1;i<ar.length;i++){
			if(ar[i]<p)
				left.add(ar[i]);
			else if(ar[i]>p)
				right.add(ar[i]);
		}
		Integer[] leftArray=new Integer[left.size()]; 
		leftArray=QuickSortPartition(left.toArray(leftArray));
		printArray(leftArray);
		Integer[] rightArray=new Integer[right.size()];
		rightArray=QuickSortPartition(right.toArray(rightArray));
		printArray(rightArray);
		for(int i=0;i<leftArray.length;i++){
			ar[index]=leftArray[i];
			index++;
		}
		ar[index++]=p;
		for(int i=0;i<rightArray.length;i++){
			ar[index]=rightArray[i];
			index++;
		}

		return ar;
	}
	
	private static void printArray(Integer[] ar) {
		if(ar.length<=1)
			return;
		for(int n: ar){
			System.out.print(n+" ");
		}
		System.out.println("");
	}


}
