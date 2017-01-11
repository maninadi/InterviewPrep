package Java;

import java.util.*;

public class JavaHash {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        HashSet<String> unique=new HashSet<String>();
        int count=0;
        for(int i=0;i<t;i++){
        	String str=new String(pair_left[i]+"-"+pair_right[i]);
            if(!unique.contains(str)){
                count++;
                unique.add(str);
            }
            System.out.println(count);
        }
        
	}
}
