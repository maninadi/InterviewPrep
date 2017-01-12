package vmware;

import java.util.Arrays;
import java.util.HashMap;

public class Rank {

	// A utility function to find factorial of n
	int fact(int n)
	{
		if(n<=1)
			return 1;
	    return n * fact(n-1);
	}
	 
	int nextChar(String str, int low, int high)
	{
	    int countRight = 0;
	 
	    for (int i = low+1; i <= high; ++i)
	        if (str.charAt(i) < str.charAt(low))
	            countRight++;
	 
	    return countRight;
	}
	 
	int getPermRank (String str)
	{
	    int len = str.length();
	    int rank = 0;
	    char[] arr=str.toCharArray();
	    HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
	    for(Character c:arr){
	    	if(hm.containsKey(c))
	    		hm.put(c, hm.get(c)+1);
	    	else
	    		hm.put(c, 1);
	    		
	    }
	    Arrays.sort(arr);
	    for(int i=0;i<str.length();i++){
	    	int k=0;
	    	for(Character c:arr){
		    	if(c<str.charAt(i))
		    		k++;
		    }
	    	for(int j=1;j<len-i-1;j++){
	    		rank+=(k*(fact(j)));
	    	}
	    }
	    
	    return rank;
	}

}
