package Strings;

import java.util.*;
import java.math.*;

/*
 * Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.

	If the fractional part is repeating, enclose the repeating part in parentheses.
	
	Example :
	
	Given numerator = 1, denominator = 2, return "0.5"
	Given numerator = 2, denominator = 1, return "2"
	Given numerator = 2, denominator = 3, return "0.(6)"
 */


public class FractionToDecimal {

	public static void main(String[] args){
		
		System.out.println(fractionToDecimal(1, 2));
		System.out.println(fractionToDecimal(2, 1));
		System.out.println(fractionToDecimal(2, 3));
	}
	static String fractionToDecimal(int numerator, int denominator) {
	    
	    long n=numerator;
	    long d=denominator;
	    if(d==0){
	        return "";
	    }
	    
	    if(n%d==0){
	        return String.valueOf(n/d);
	    }
	    StringBuilder res=new StringBuilder();
	    if((n<0&&d>0)||(n>0&&d<0)){
	        res.append("-");
	    }
	    n=Math.abs(n);
	    d=Math.abs(d);
	    
	    res.append(n/d);
	    res.append(".");
	    
	    n=(n%d);
	    n*=10;
	    
	    HashMap<Long,Integer> tracker=new HashMap<Long,Integer>();
	    
	    while(!tracker.containsKey(n) && n!=0){
	        tracker.put(n,res.length());
	        res.append(n/d);
	        n%=d;
	        n*=10;
	    }
	    
	    if(n!=0){
    	    res.append(")");
    	    res.insert(tracker.get(n),"(");    
	    }
	    
	    
	   return res.toString();
	}
}
