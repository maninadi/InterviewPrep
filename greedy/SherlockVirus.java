package greedy;

import java.util.*;

public class SherlockVirus {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
            System.out.println(getMax(in.nextInt()));
        
        in.close();
    }
    
    private static String getMax(int n){
    	int fives=0;
    	int threes=0;
    	
    	fives=n/3;
    	threes=n%3;
    	
    	fives*=3;
    	while(threes%5!=0){
    		fives-=3;
    		if(fives<0)
    			return "-1";
    		threes+=3;
    	}
    	StringBuilder sb=new StringBuilder();
    	for(int i=0;i<fives;i++)
    		sb.append('5');
    	for(int i=0;i<threes;i++)
    		sb.append('3');
    	return sb.toString();
    }
}
