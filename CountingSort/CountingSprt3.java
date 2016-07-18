package CountingSort;

import java.util.Scanner;

public class CountingSprt3 {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner s = new Scanner(System.in);
          int N=s.nextInt();
          int[] ints=new int[N];
          String[] original=new String[N];
          String[] sorted=new String[N];
          int[] index=new int[100];
          for(int i=0;i<N;i++){
        	  ints[i]=s.nextInt();
        	  original[i]=s.next();
        	  sorted[i]="";
        	  index[ints[i]]++;
          }
          s.close();
          index=doSum(index);
          placeStrings(index,ints,original,sorted);
          printArray(sorted);
          
    }
    private static void placeStrings(int[] indexes,int[] ints, String[] original,String[] sorted) {
		for(int i=original.length-1;i>=original.length/2;i--){
			int index=--indexes[ints[i]];
			sorted[index]=original[i];
		}
	}
	static int[] doSum(int[] ar){
    	int runningSum=0;
    	for(int i=0;i<100;i++){
    		runningSum+=ar[i];
    		ar[i]=runningSum;
    	}
    	return ar;
    }
    
    static void printArray(String[] strs){
    	StringBuilder sb=new StringBuilder();
    	for(String s:strs){
    		if(!s.isEmpty())
    			sb.append(s+" ");
    		else
    			sb.append("- ");
    	}
    	System.out.println(sb.toString());
    }
}
