package code24;

import java.util.*;

public class LadyBug {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for(int a0 = 0; a0 < Q; a0++){
            int n = in.nextInt();
            String b = in.next();
            System.out.println(isAllBugsHappy(b)?"YES":"NO");
        }
        in.close();
    }

	private static boolean isAllBugsHappy(String b) {
		boolean hasUnderScore=false;
		boolean hasSameAdjColors=true;
		int[] charCounts=new int[26];
		for(int i=0;i<b.length();i++){
			char c=b.charAt(i);
			if(c!='_'){
				charCounts[c-'A']++;
				hasSameAdjColors=(hasSameAdjColors && adjColosOK(b,i,c));
			}
			else{
				hasUnderScore=true;
			}
			
		}
		if(hasUnderScore){
			for(int i=0;i<charCounts.length;i++){
				if(charCounts[i]>0 && charCounts[i]<2)
					return false;
			}
			return true;
		}
		return hasSameAdjColors;
	}

	private static boolean adjColosOK(String b, int i, char c) {
		int left=i-1;
		int right=i+1;
		if(left>=0 && b.charAt(left)==c)
			return true;
		if(right<b.length() && b.charAt(right)==c)
			return true;
		return false;
	}
}
