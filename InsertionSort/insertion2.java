package InsertionSort;

import java.util.Scanner;

public class insertion2 {
	public static void insertionSortPart2(int[] ar)
	{       
		for(int i=1;i<ar.length;i++){
			insertionSortPart1(ar,i);
	    	printArray(ar);
		}
	}  
	public static void insertionSortPart1(int[] ar,int n) {
    	int k=ar[n];
    	int i=n-1;
    	for(;i>=0;i--){
    		if(ar[i]>k)
    			ar[i+1]=ar[i];
    		else
    			break;
    	}
    	ar[i+1]=k;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for(int i=0;i<s;i++){
			ar[i]=in.nextInt(); 
		}
		insertionSortPart2(ar);    

	}    
	private static void printArray(int[] ar) {
		for(int n: ar){
			System.out.print(n+" ");
		}
		System.out.println("");
	}
}
