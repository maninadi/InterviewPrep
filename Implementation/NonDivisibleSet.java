package Implementation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class NonDivisibleSet {
	public static void main(String[] args) throws Exception {
	       Scanner in = new Scanner(System.in);
	       int N=in.nextInt();
	       int k=in.nextInt();
	       
	       int[] mods=new int[k];
	  	             
	       for(int i=0;i<N;i++){
	    	   int a=in.nextInt();
	    	   mods[a%k]++;
	       }
	       
	       int count=0;
	       count+=Math.min(1, mods[0]);;
	       if(k%2==0)
	    	   mods[k/2]=Math.min(1, mods[k/2]);
	       for(int i=1;i<=k/2;i++){
	    	   int diff=k-i;
	    	   count+=Math.max(mods[i], mods[diff]);
	       }
	       System.out.println(count);
    }
}
