package Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SuperReducedString {

	public static void main(String[] args){

		String pattern = "([a-zA-Z])\\1";;
		Pattern r = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);

		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		Matcher m = r.matcher(input);
		while(m.find()){
			input = input.replaceAll(m.group(),"");
			m = r.matcher(input);
		}
		System.out.println(input.length()>0?input:"Empty String");
		
	}
}
