package Strings;

/*
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

	If the last word does not exist, return 0.
	
	Note: A word is defined as a character sequence consists of non-space characters only.
	
	Example:
	
	Given s = "Hello World",
	
	return 5 as length("World") = 5.
	
	Please make sure you try to solve this problem without using library functions. Make sure you only traverse the string once.
 */
public class LengthLast {

	public static void main(String[] args){
		
		System.out.println(lengthLast("Hello world"));
		System.out.println(lengthLast("H"));
		System.out.println(lengthLast(""));
		System.out.println(lengthLast("H H"));
		
	}
	
	static int lengthLast(String s){
		if(s.length()<=1)
			return s.length();
		
		int max=0;
		int count=0;
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				max=count!=0?count:max;
				count=0;
			}
			else{
				count++;
			}
		}
		return count!=0?count:max;
	}
}
