package Strings;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ValidString {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	 try{
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             String input=br.readLine();
             System.out.println(checkThis(input)?"YES":"NO");
         }
         catch(Exception e){
        	 e.printStackTrace();
         }
    }

	private static boolean checkThis(String s) {
		if(s.length()<=2)
			return true;
		int[] count=new int[26];
		for(int i=0;i<s.length();i++)
			count[s.charAt(i)-'a']++;
		
		boolean found=false;
		int max=count[0];
		for(int i=1;i<count.length;i++){
			if((count[i]>0) && (count[i]!=max)){
				if(found)
					return false;
				found=true;
			}
		}
		return true;
	}
}
