package codeSprint7;

import java.util.*;

public class SockMerchant {

	 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<Integer,Integer> colors=new HashMap<Integer,Integer>();
        for(int c_i=0; c_i < n; c_i++){
            int c=in.nextInt();
            if(colors.containsKey(c))
            	colors.put(c, colors.get(c)+1);
            else
            	colors.put(c,1);
        }
        int pairs=0;
        for(int i:colors.keySet())
        	pairs+=(colors.get(i)/2);
        
        System.out.println(pairs);	
        in.close();
	}
}
