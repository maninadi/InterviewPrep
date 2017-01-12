package Java;

import java.util.*;

public class MinMaxString {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*String s=in.next();
        int k=in.nextInt();
        String max=s.substring(0, k);
        String min=max;
        for(int i=1;(i+k-1)<s.length();i++){
        	String s1=s.substring(i, i+k);
        	if(max.compareTo(s1)<0)
        		max=s1;
        	if(min.compareTo(s1)>0)
        		min=s1;
        }
        System.out.println(min);
        System.out.println(max);
*/
        String a = in.next();
        String b = in.next();
        in.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
	
	static void reverse(Scanner in){
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder sb=new StringBuilder(A);
        if(sb.reverse().toString().compareTo(A)==0)
        	System.out.println("Yes");
        else
        	System.out.println("No");
	}
	
	static boolean isAnagram(String a, String b){
		int[] count=new int[26];
		
		for(int i=0;i<a.length();i++){
			int index=getIndex(a.charAt(i));
			count[index]++;
		}
		for(int i=0;i<b.length();i++){
			int index=getIndex(b.charAt(i));
			count[index]--;
		}
		for(int i=0;i<26;i++){
			if(count[i]!=0)
				return false;
		}
		
		return true;
	}

	private static int getIndex(char charAt) {
		if(charAt>='a' && charAt<='z')
			return charAt-'a';
		if(charAt>='A' && charAt<='Z')
			return charAt-'A';
		return 0;
	}
}
