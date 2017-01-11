package codesprint6;

import java.util.*;

public class FlipMatrix {

	 public static void main(String[] args) {
		 /*Scanner in = new Scanner(System.in);
		 
		 int q=in.nextInt();
		 long sum=0;
		 for(int k=1;k<=q;k++){
			 int n=in.nextInt();
			 sum=0;
			 int[][] ar=getIn(in,n);
			 for(int i=0;i<n;i++){
					for(int j=0;j<n;j++){
						sum+=max(ar,n,i,j);
					}
			 }
			 System.out.println(sum);
		 }
		 in.close();
		 */
		 Scanner in = new Scanner(System.in);
	        int T=in.nextInt();
	        while(T-->0)
	        {
	            int n = in.nextInt();
	            int p = in.nextInt();
	            Calculator myCalculator = new Calculator();
	            try
	            {
	                int ans=myCalculator.power(n,p);
	                System.out.println(ans);
	                
	            }
	            catch(Exception e)
	            {
	                System.out.println(e.getMessage());
	            }
	        }

	 }

	private static int[][] getIn(Scanner in,int n) {
		n*=2;
		int[][] ar=new int[2*n][2*n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				ar[i][j]=in.nextInt();
			}
		}
		return ar;
	}
	
	private static int max(int[][] ar,int n,int i,int j){
		n*=2;
		int a=Math.max(ar[i][j], ar[i][n-1-j]);
		int b=Math.max(ar[n-1-i][j], ar[n-1-i][n-1-j]);
		return Math.max(a, b);
	}
}

class Calculator{
    
    public int power(int n,int p) throws Exception
    {
        if(n<0 || p<0)
            throw new Exception("n and p should be non-negative");
        return (int)Math.pow(n,p);
    }
}
