package Strings;

import java.util.*;

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
