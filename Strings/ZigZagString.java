package Strings;

/*
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

	P.......A........H.......N
	..A..P....L....S....I...I....G
	....Y.........I........R
	And then read line by line: PAHNAPLSIIGYIR
	Write the code that will take a string and make this conversion given a number of rows:
	
	string convert(string text, int nRows);
	convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR"
	**Example 2 : **
	ABCD, 2 can be written as
	
	A....C
	...B....D
	and hence the answer would be ACBD.
 */


public class ZigZagString {

	public static void main(String[] args){
		
		System.out.println(zigzag("PAYPALISHIRING",3));
		System.out.println(zigzag("ABCD",1));
		System.out.println(zigzag("NX9AROO79WZSd",24));
	}
	
	static String zigzag(String s,int rows){
		
		String[] strs=new String[rows];
		
		int i=0;
		int add=1;
		int cnt=0;
		boolean flip=false;
		while(cnt<s.length()){
			
			if(strs[i]==null)
				strs[i]=new String();
			strs[i]+=s.charAt(cnt);
			cnt++;
			
			if((i==rows-1)||(i==0)){
				flip=!flip;
				
			}
			add=rows!=1?(flip?1:-1):0;
			i+=add;
		}
		
		StringBuilder sb=new StringBuilder();
		
		for(String s1:strs){
			if(s1!=null)
				sb.append(s1);
		}
				
		return sb.toString();
	}
	
}
