package DynamicProgramming;

import java.util.*;

public class StockMaximise {
	  public static void main(String[] args) {
	  
		  Scanner in = new Scanner(System.in);
		  
		  int T=in.nextInt();
		  for(int i=1;i<=T;i++){
			  System.out.println(runOnTestCase(in));
		  }
		  
		  in.close();
	  }

	private static long runOnTestCase(Scanner in) {
		
		int N=in.nextInt();
		int[] a= new int[N];
		for(int i=0;i<N;i++)
			a[i]=in.nextInt();
		long profit=0;
		long costSoFar=0;
		for (int i=N-1; i>=0; --i) {
            costSoFar= Math.max(costSoFar, a[i]);
            profit += costSoFar - a[i];
        }
		return profit;
	}
}
