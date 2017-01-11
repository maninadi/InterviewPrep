package Java;

import java.util.*;

public class ExceptTryCatch2 {
	 public static void main(String []argh)
	    {
	        Scanner in = new Scanner(System.in);

	        while(in.hasNextInt())
	        {
	            int n = in.nextInt();
	            int p = in.nextInt();
	            myCalculator M = new myCalculator();
	            try
	            {
	                System.out.println(M.power(n,p));
	            }
	            catch(Exception e)
	            {
	                System.out.println(e);
	            }
	        }

	    }
}

class myCalculator {

	final String STR_NEGATIVE_VALUES="n and p should be non-negative";
	public int power(int n,int p) throws Exception{
		if(n<0 ||p<0)
			throw new Exception(STR_NEGATIVE_VALUES);
		return (int) Math.pow(n, p);
	}
}
