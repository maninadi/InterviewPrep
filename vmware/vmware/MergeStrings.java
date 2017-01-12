package vmware;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MergeStrings {
	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        String res;
        String _a;
        try {
            _a = in.nextLine();
        } catch (Exception e) {
            _a = null;
        }
        
        String _b;
        try {
            _b = in.nextLine();
        } catch (Exception e) {
            _b = null;
        }
        
        res = mergeStrings(_a, _b);
        System.out.println(res);
    }
	
	static String mergeStrings(String a, String b) {

		StringBuilder s=new StringBuilder();
		
		String s1=a.length()>b.length()?b:a;
		String s2=s1.compareTo(a)==0?b:a;
		
		for(int i=0;i<s1.length();i++){
			s.append(a.charAt(i));
			s.append(b.charAt(i));
		}
		
		for(int i=s1.length();i<s2.length();i++)
			s.append(s2.charAt(i));
		
		
		
		return s.toString();

    }

}
