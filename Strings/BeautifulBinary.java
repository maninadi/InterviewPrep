package Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BeautifulBinary {

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		String s = in.next();
		in.close();
		int count=0;
		char[] cs=s.toCharArray();
		for(int i=0;i<n-2;i++){
			if(cs[i]=='0' && s.substring(i, i+3).compareTo("010")==0){
				cs[i+2]='1';
				count++;
			}
		}
		System.out.println(count);		
	}
}
