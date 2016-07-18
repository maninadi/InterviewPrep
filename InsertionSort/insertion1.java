package InsertionSort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class insertion1 {
	public static void insertIntoSorted(int[] ar) {
		int n=ar.length-1;
    	int k=ar[n];
    	int i=n-1;
    	for(;i>=0;i--){
    		if(ar[i]>k)
    			ar[i+1]=ar[i];
    		else
    			break;
    		printArray(ar);
    	}
    	ar[i+1]=k;
    	printArray(ar);
	}


	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for(int i=0;i<s;i++){
			ar[i]=in.nextInt(); 
		}
		insertIntoSorted(ar);
	}


	private static void printArray(int[] ar) {
		for(int n: ar){
			System.out.print(n+" ");
		}
		System.out.println("");
	}

}
