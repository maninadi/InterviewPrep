package ctci;

import java.util.*;

public class MakingAnagrams {

	public static int numberNeeded(String first, String second) {

		int count=0;
		int[] frequency=new int[26];
		for(int i=0;i<first.length();i++)
			frequency[first.charAt(i)-'a']++;
		
		for(int i=0;i<second.length();i++)
			frequency[second.charAt(i)-'a']--;
		
		for(int i=0;i<frequency.length;i++)
			count+=Math.abs(frequency[i]);
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}
}
