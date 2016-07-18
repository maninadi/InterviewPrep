package Implementation;

import java.util.*;

public class JumpCloud {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        in.close();
        System.out.println(findMinJump(c));
    }
	
	private static int findMinJump(int[] c){
		HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
		return findMinJump(c,0,c.length-1,0,hm);
	}
	

	private static int findMinJump(int[] c,int start,int end,int jump,HashMap<Integer,Integer> hm) {
		if(start>=end)
			return jump;
		if(c[start]==1)
			return Integer.MAX_VALUE;
		jump++;
		if(hm.containsKey(start))
			return hm.get(start);
		
		int ret=Math.min(findMinJump(c,start+2,end,jump,hm), findMinJump(c,start+1,end,jump,hm));
		hm.put(start, ret);	
		return ret;
	}
}
