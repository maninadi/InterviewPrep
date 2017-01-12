package Sorting;

import java.util.Scanner;

public class AlmostSorted {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in=new Scanner(System.in);
    	
    	int n=in.nextInt();
    	int[] ar=new int[n];
    	for(int i=0;i<n;i++){
    		ar[i]=in.nextInt();
    	}
    	in.close();
    	checkArray(ar);
    }
    
    static void checkArray(int[] ar){
    	int n=ar.length;
    	int left=getLeft(ar);
    	if(left==n){
    		System.out.println("yes");
    		return;
    	}
    	
    	int right=getRight(ar);
    	if(checkSwap(ar,left,right)){
    		System.out.println("yes");
    		System.out.println("swap "+(right+1)+" "+(left+1));
    		return;
    	}
    	if(checkReverse(ar,left-1,right)){
    		System.out.println("yes");
    		System.out.println("revers "+(left-1)+" "+(right));
    		return;
    	}
    	System.out.println("no");
    }

	private static boolean checkSwap(int[] ar, int i, int j) {
		if(i<=j)
			return false;
		while(j<i){
			if(ar[j]<ar[j+1])
				return false;
			j++;
		}
		return true;
	}
	
	private static boolean checkReverse(int[] ar, int i, int j) {
		while(i<j){
			if(ar[i]<ar[i+1])
				return false;
			i++;
		}
		return true;
	}

	private static int getLeft(int[] ar) {
		int i=1;
		for(;i<ar.length;i++){
			if(ar[i]<ar[i-1])
				return i;
		}
		return i;
	}
	
	private static int getRight(int[] ar){
		int i=ar.length-1;
		for(;i>0;i--){
			if(ar[i]<ar[i-1])
				return i-1;
		}
		return i;
	}
	

}
