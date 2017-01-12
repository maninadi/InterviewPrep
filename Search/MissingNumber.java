package Search;

import java.util.HashMap;
import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       HashMap<Integer,Integer> hm=new  HashMap<Integer,Integer>();
       for(int i=0;i<n;i++){
    	   int k =in.nextInt();
    	   if(hm.containsKey(k)){
    		   hm.put(k, hm.get(k)+1);
    	   }
    	   else{
    		   hm.put(k, 1);
    	   }
       }
       int m=in.nextInt();
       for(int i=0;i<m;i++){
    	   int k =in.nextInt();
    	   if(hm.containsKey(k)){
    		   hm.put(k, hm.get(k)-1);
    	   }
       }
       for(int k:hm.keySet()){
    	   if(hm.get(k)!=0)
    		   System.out.print(k+" ");
       }
       in.close();
    }
}
