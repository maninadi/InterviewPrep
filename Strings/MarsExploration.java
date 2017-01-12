package Strings;

import java.util.*;

public class MarsExploration {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        in.close();
        int k=S.length()/3;
        String S1="";
        for(int i=1;i<=k;i++)
        	S1+="SOS";
        int count=0;
        for(int i=0;i<S.length();i++){
    		if(S1.charAt(i)!=S.charAt(i))
    			count++;
        }
        System.out.println(count);
    }
}
