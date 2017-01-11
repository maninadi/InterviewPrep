package Java;

import java.util.*;

public class JaveDeque {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if(deque.size()==m){
            	max=Math.max(max, hm.size());
            	int k=((Integer)deque.removeFirst());
            	hm.put(k, hm.get(k)-1);
            	if(hm.get(k)==0)
            		hm.remove(k);
            }
            deque.addLast(num);
        	if(!hm.containsKey(num))
        		hm.put(num, 0);
        	hm.put(num, hm.get(num)+1);

        }
        System.out.println(max);
    }
}

