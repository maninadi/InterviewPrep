package code25;

import java.util.*;

public class AppendAndDelete {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //String s = in.next();
        //String t = in.next();
        //int k = in.nextInt();
        in.close();
        System.out.println(canDoIt("ab","a",4)?"Yes":"No");
    }

	private static boolean canDoIt(String s, String t,int k) {
		int l1=s.length();
		int l2=t.length();
		if(l1+l2<=k)
			return true;
		if(s.compareTo(t)==0 && k>=(2*l1))
			return true;
		char[] smaller=l1>l2?t.toCharArray():s.toCharArray();
		char[] larger=l1>l2?s.toCharArray():t.toCharArray();
		int i=0;
		for(;i<smaller.length;i++){
			if(smaller[i]!=larger[i])
				break;
		}
		k-=(larger.length-i);
		if(i==smaller.length && ((k>=0)&&(k%2==0)))
			return true;

		k-=(smaller.length-i);
		if(k>=0 && k%2==0)
			return true;
		
		return (l1==0)||(l2==0)?true:false;
	}
}
