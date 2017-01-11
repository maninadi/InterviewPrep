package Implementation;

import java.util.*;

public class CaesarCipher {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        for(int i=0;i<s.length();i++){
        	System.out.print(getChar(s.charAt(i),k));
        }
    }

	private static char getChar(char charAt,int k) {
		if(!Character.isLetter(charAt))
			return charAt;
		
		char c=(char)(charAt+(k%26));
		
		if(charAt>='A' && charAt<='Z' )
			return c>'Z'?(char)(c-26):c;

		if(charAt>='a' && charAt<='z' )
			return c>'z'?(char)(c-26):c;
					
		return charAt;
	}
}
