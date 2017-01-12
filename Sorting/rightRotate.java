package Sorting;

import java.util.Scanner;

public class rightRotate {
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in=new Scanner(System.in);
    	
    	int n=in.nextInt();
    	int k=in.nextInt();
    	int q=in.nextInt();
    	int[] ar=new int[n];
    	for(int i=0;i<n;i++){
    		ar[i]=in.nextInt();
    	}
    	rotateRight(ar,k);
    	for(int i=1;i<=q;i++){
    		int j=in.nextInt();
    		System.out.println(ar[j]);
    	}
    	in.close();
    	
    }
    
    static void rotateRight(int ar[],int k){
    	int[] temp=new int[k];
    	int n=ar.length;
    	k=k%n;
    	for(int i=1;i<=k;i++){
    		temp[k-i]=ar[n-i];
    	}
    	
    	for(int i=n-k-1;i>=0;i--){
    		ar[i+k]=ar[i];
    	}
    	for(int i=0;i<k;i++){
    		ar[i]=temp[i];
    	}
    }

}
