package Strings;

import java.util.HashSet;
import java.util.Scanner;

public class StringConstruction {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        for(int a0 = 0; a0 < n; a0++){
	            String s = in.next();
	            HashSet<Character> hs=new HashSet<Character>();
	            int count=0;
	            for(int i=0;i<s.length();i++){
	            	if(!hs.contains(s.charAt(i))){
	            		count++;
	            		hs.add(s.charAt(i));
	            	}
	            }
	            System.out.println(count);
	        }
	        
	        in.close();
	  }
}
