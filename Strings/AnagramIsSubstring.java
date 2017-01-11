package Strings;

import java.util.*;

public class AnagramIsSubstring {
	
	public static void main(String[] args){
		System.out.println(isAnagramSubstring("afdgzysdyzf", "xyz"));
	}

	static boolean isAnagramSubstring(String s1,String s2){
		
		HashMap<Character,Integer> hm=getCounts(s2);
		
		HashMap<Character,Integer> hm1=(HashMap<Character, Integer>) hm.clone();
		int i=0;
		int len=s2.length();
		while(i<s1.length()){
			char c=s1.charAt(i);
			if(hm.containsKey(c)){
				hm1.put(c, hm.get(c)-1);
				if(hm1.get(c)==0)
					hm1.remove(c);
				len--;
			}
			else if(len!=s2.length()){
				len=s2.length();
				hm1=(HashMap<Character, Integer>) hm.clone();
			}
			
			if(len==0 && checkMap(hm1))
				return true;
			i++;
		}
		
		return false;
	}

	private static boolean checkMap(HashMap<Character, Integer> hm1) {
		
		return hm1.size()>0?false:true;
	}

	private static HashMap<Character,Integer> getCounts(String s2) {
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<s2.length();i++){
			int count=0;
			char c=s2.charAt(i);
			if(hm.containsKey(c))
				count=hm.get(c);
			hm.put(c, count+1);
		}
		return hm;
	}
}
