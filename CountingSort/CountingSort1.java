package CountingSort;

import java.util.Scanner;

public class CountingSort1 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner s = new Scanner(System.in);
          int N=s.nextInt();
          int[] ints=new int[100];
          for(int i=1;i<=N;i++){
        	  int k=s.nextInt();
        	  ints[k]++;
          }
          printArray(ints);
    }
    
    
    static void printArray(int[] ints){
    	for(int i=0;i<ints.length;i++){
    		System.out.print(ints[i]+" ");
    	}
    }
}
