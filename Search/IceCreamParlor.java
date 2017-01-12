package Search;

import java.util.HashMap;
import java.util.Scanner;

public class IceCreamParlor {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	int T=in.nextInt();
    	for(int i=1;i<=T;i++){
    		runOneTestCase(in);
    	}
    	
    }

	private static void runOneTestCase(Scanner in) {
		int M=in.nextInt();
    	int N=in.nextInt();
    	int[] a=new int[N];
    	for(int i=0;i<N;i++){
    		a[i]=in.nextInt();
    	}
    	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    	for(int i=0;i<N;i++){
    		int diff= M-a[i];
    		if(hm.containsKey(M-a[i])){
    			System.out.println((hm.get(diff)+1)+" "+(i+1));
    		}else{
    			hm.put(a[i], i);
    		}
    	}
		
	}
}
