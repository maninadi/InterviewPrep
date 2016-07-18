package Implementation;

import java.util.*;

public class Kangaroo {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
        int denom=(v1-v2);
        boolean res=false;
        if(denom>0)
        	res=(((x2-x1)%denom)==0);
        
        System.out.println(res?"YES":"NO");
        	
    }
}
