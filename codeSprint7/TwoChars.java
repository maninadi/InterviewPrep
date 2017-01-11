package codeSprint7;

import java.util.*;

public class TwoChars {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        in.close();
        boolean replaced=true;
        while(replaced){
        	replaced=false;
	        for(int i=0;i<s.length()-1;i++){
	        	if(s.charAt(i)==s.charAt(i+1)){
	        		s=s.replaceAll(""+s.charAt(i),"");
	        		replaced=true;
	        	}
	        }
        }
        
        int[] counts=new int[26];
        for(int i=0;i<s.length();i++)
        	counts[s.charAt(i)-'a']++;
        
        if(s.length()>3){
        	for(int i=0;i<26;i++){
        		if(counts[i]==1){
        			s=s.replaceAll(""+(i+'a'),"");
        			counts[i]=0;
        		}
        	}
        }
        
        System.out.println(s.length());
    }
}

