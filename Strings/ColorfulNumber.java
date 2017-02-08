package Strings;

import java.util.*;

/*
 * For Given Number N find if its COLORFUL number or not

	Return 0/1
	
	COLORFUL number:
	
	A number can be broken into different contiguous sub-subsequence parts. 
	Suppose, a number 3245 can be broken into parts like 3 2 4 5 32 24 45 324 245. 
	And this number is a COLORFUL number, since product of every digit of a contiguous subsequence is different
	Example:
	
	N = 23
	2 3 23
	2 -> 2
	3 -> 3
	23 -> 6
	this number is a COLORFUL number since product of every digit of a sub-sequence are different. 
	
	Output : 1
 */
public class ColorfulNumber {

	public static void main(String[] args){
		int[] a={3245,123,565,777,234,1000};
		for(int i:a){
			System.out.format("%d %s\n",i,colorful(i)==0?"No":"Yes");
		}
	}
	
	static int colorful(int a) {
	    
	    String s=Integer.toString(a);
	    
	    HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<s.length();i++){
            
            for(int j=0;(j+i)<s.length();j++){
                int num=getProduct(s.substring(j,j+i+1));
                if(hs.contains(num))
                    return 0;
                hs.add(num);
            }
        }
        
        return 1;
	    
	}
	
	static int getProduct(String s){
	    int num=s.charAt(0)-'0';
	    for(int i=1;i<s.length();i++){
	        num*=s.charAt(i)-'0';
	    }
	    return num;
	}
}
