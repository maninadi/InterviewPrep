package code25;

import java.util.*;

public class TwoSets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        int mina=Integer.MAX_VALUE;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            mina=Math.min(mina, a[a_i]);
        }
        int[] b = new int[m];
        int minb=Integer.MAX_VALUE;
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
            minb=Math.min(minb, b[b_i]);
        }


        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=mina;i<=minb;i++){
        	boolean canAdd=true;
        	for(int j=0;j<a.length;j++){
        		if(i%a[j]!=0){
        			canAdd=false;
        			break;
        		}
        	}
        	if(canAdd)
        		al.add(i);
        		
        }
        
        int count=0;
        for(int i=0;i<al.size();i++){
        	int k=al.get(i);
        	boolean canAdd=true;
        	for(int j=0;j<b.length;j++){
        		if(b[j]%k!=0){
        			canAdd=false;
        			break;
        		}
        	}
        	if(canAdd)
        		count++;
        		
        }
        System.out.println(count);
    }
    

}
