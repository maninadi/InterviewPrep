package InsertionSort;

import java.util.Scanner;

public class insertion3 {
	
	public static void insertionSortPart2(int[] ar)
	{   int shifts=0;    
		for(int i=1;i<ar.length;i++){
			shifts+=insertionSortPart1(ar,i);
		}
		System.out.println(shifts);
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
