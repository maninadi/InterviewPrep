package Implementation;


/*
 * Given a column title as appears in an Excel sheet, return its corresponding column number.

	Example:
	
	    A -> 1
	    
	    B -> 2
	    
	    C -> 3
	    
	    ...
	    
	    Z -> 26
	    
	    AA -> 27
	    
	    AB -> 28 
 */

import java.util.*;

public class ExcelColumnToInt {

	static HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
	
	public static void main(String[] args){
		
		fillHM();
		
		System.out.println(toInt("A"));
		System.out.println(toInt("Z"));
		System.out.println(toInt("AA"));
		System.out.println(toInt("AZ"));
		System.out.println(toInt("ZZ"));
		System.out.println(toInt("AB"));
	}
	
	static void fillHM(){
		
		for(int i=0;i<26;i++){
			hm.put((char) ('A'+i), i+1);
		}
	}
	
	static int toInt(String col){
		
		int res=hm.get(col.charAt(0));
		int i=1;
		while(i<col.length()){
			res*=26;
			res+=hm.get(col.charAt(i));
			i++;
		}
		
		return res;
	}
	
}
