package Strings;

import java.util.*;

public class MaxSubStringNoRepeatChars {
	
	public static void main(String[] args){
		
		System.out.println(maxSubstringMaxChars("aabcddefghijki"));
	}
	
	static int maxSubstringMaxChars(String s){
		
		int max=Integer.MIN_VALUE;
		
		int end=0;
		int start=0;
		HashSet<Character> chars=new HashSet<Character>();
		while(end<s.length()){
			
			if(!chars.contains(s.charAt(end))){
				chars.add(s.charAt(end));
				max=Math.max(max, chars.size());
			}
			else{
				
				while(s.charAt(start)!=s.charAt(end)){
					chars.remove(s.charAt(start));
					start++;
				}
				start++;
			}
			end++;
			
		}
		return max;
	}
}
