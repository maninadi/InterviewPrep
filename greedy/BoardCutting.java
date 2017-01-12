package greedy;

import java.util.*;


public class BoardCutting {
    static long divisor=1000000007;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=1;i<=t;i++){
            int m=in.nextInt();
            int n=in.nextInt();
            long[] cy=getArr(in,m-1);
            long[] cx=getArr(in,n-1);
            System.out.println(findCost(cy,cx));
        }
        in.close();
    }
    
    static long[] getArr(Scanner in,int len){
        long[] arr=new long[len];
        for(int i=0;i<len;i++){
            arr[i]=in.nextInt();
        }
        return arr;
    }
    
    static long findCost(long[] cy,long[] cx){
        long cost=0;
        long hSplits=1;
        long vSplits=1;
        Arrays.sort(cy);
        Arrays.sort(cx);
        
        int yi=cy.length-1;;
        int xi=cx.length-1;
        
        while(yi>=0 && xi>=0){
        	if(cy[yi]>=cx[xi]){
        		cost+=((vSplits*cy[yi])%divisor);
        		yi--;
        		hSplits++;
        	}else{
        		cost+=((hSplits*cx[xi])%divisor);
        		xi--;
        		vSplits++;
        	}
        }
        
        if(yi>=0){
        	while(yi>=0 ){
        		cost+=((vSplits*cy[yi])%divisor);
            	yi--;
            	hSplits++;
            }	
        }
        else if(xi>=0){
        	while(xi>=0){
           		cost+=((hSplits*cx[xi])%divisor);
           		xi--;
           		vSplits++;
            }        	
        }
        return cost%divisor;
    }
}
