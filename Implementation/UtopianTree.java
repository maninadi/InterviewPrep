package Implementation;

import java.math.BigInteger;
import java.util.*;

public class UtopianTree {
	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int a0 = 0; a0 < t; a0++){
	            int n = in.nextInt();	
	            BigInteger total=new BigInteger("1");
	            boolean check=true;
	            while(n>0){
	            	if(check)
	            		total=total.multiply(new BigInteger("2"));
	            	else
	            		total=total.add(BigInteger.ONE);
	            	check=!check;
	            	n--;
	            }
		        System.out.println(total.toString());
	        }
	        
	    }
}
