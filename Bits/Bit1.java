package Bits;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Bit1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	try{
    	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   	    	BigInteger T=getInt(br);
   	    	for(int i=1;i<=T.longValue();i++){
   	    		System.out.println(getWinner(getInt(br)));
   	    	}
    	}catch(Exception e){
    		e.printStackTrace();
    	}

    }
    
    static String getWinner(BigInteger N){
    	int count0s=0;
    	int count1s=0;
    	while(N.compareTo(BigInteger.ZERO)>0){
    		if(N.testBit(0)) 
    			count1s++;
    		else if(count1s==0)
    			count0s++;
    		N=N.shiftRight(1);
    	}
    	return ((count0s+count1s)%2)==0?"Louise":"Richard" ;
    }
    
    static BigInteger getInt(BufferedReader br){
      BigInteger T=null;
      try{
	      String input=br.readLine();
	      T=new BigInteger(input.trim());
	  }
	  catch(Exception e){
		  T=new BigInteger("0");
	      e.printStackTrace();
	  }
	  return T;
    }
}
