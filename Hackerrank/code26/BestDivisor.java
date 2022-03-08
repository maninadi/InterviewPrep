package code26;


import java.util.*;

public class BestDivisor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer> (); 
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
            	int k=n/i;
            	add(hm,k);
            	add(hm,i);
            }
        }
        int sum=Integer.MIN_VALUE;
        int result=n;
        for(int i:hm.keySet()){
        	if(i>sum)
        		result=hm.get(i);
        }
        System.out.println(result);
    }
    
    static void add(HashMap<Integer,Integer> hm,int a){
    	int sum=getSum(a);
    	if(!hm.containsKey(sum))
    		hm.put(sum, a);
    	else if(a<hm.get(sum))
    		hm.put(sum, a);
    }
    
    static int getSum(int k){
        int sum=0;
        while(k!=0){
            sum+=(k%10);
            k/=10;
        }
        return sum;
    }
}
