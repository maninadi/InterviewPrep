package code22;

import java.util.Scanner;

public class Cookiers {
	   public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int m = in.nextInt();
	        in.close();
	        if(m<=n)
	        	System.out.println(n-m);
	        else{
	        	int k=(m%n);
	        	if(k>0)
	        		System.out.println(n-k);
	        	else
	        		System.out.println(0);
	        }
	        
	    }
}
