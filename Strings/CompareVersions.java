package Strings;

import java.math.BigInteger;
import java.util.regex.*;


public class CompareVersions {

	public static void main(String[] args){
		
		System.out.println(compareVersion("444444444444444444444444","4444444444444444444444444"));
	}

	static int compareVersion(String a, String b) {
	    
		   Pattern p = Pattern.compile("\\d*");
	        Matcher m1 = p.matcher(a);
	        Matcher m2 = p.matcher(b);
	        while (m1.find() &&  m2.find()) {
	           BigInteger v1=getValue(m1.group());
	           BigInteger v2=getValue(m2.group());
	           
	           if(v1.compareTo(v2)!=0){
	               return v1.compareTo(v2);
	           }
	        }
	        
	        if(m1.find() && getValue(m1.group()).compareTo(BigInteger.ZERO)!=0 )
	            return 1;
	        if(m2.find() && getValue(m2.group()).compareTo(BigInteger.ZERO)!=0)
	            return -1;
	        return 0;
		}
		
		static BigInteger getValue(String s){

			if(s.length()==0)
		        return BigInteger.ZERO;
			
		    return new BigInteger(s);
		}	
	
}
