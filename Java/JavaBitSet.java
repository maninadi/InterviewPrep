package Java;

import java.math.*; 
import java.util.*;

public class JavaBitSet {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        BitSet[] B=new BitSet[2];
        B[0]=new BitSet(n);
        B[1]=new BitSet(n);
        B[0].set(0, n, false);
        B[1].set(0, n, false);
        for(int i=0;i<m;i++){
        	String oper=in.next();
        	int operand1=in.nextInt();
        	int operand2=in.nextInt();
        	if(oper.compareTo("AND")==0){
        		B[operand1-1].and(B[operand2-1]);
        	}
        	else if(oper.compareTo("OR")==0){
        		B[operand1-1].or(B[operand2-1]);
        	} 
        	else if(oper.compareTo("XOR")==0){
        		B[operand1-1].xor(B[operand2-1]);
        	}
        	else if(oper.compareTo("FLIP")==0){
        			B[operand1-1].flip(n-operand2);
        	}
        	else if(oper.compareTo("SET")==0){
        			B[operand1-1].set(n-operand2);
        	}
    		System.out.println(findBits(B[0])+" "+findBits(B[1]));
        }
        
        in.close();
    }
	
	public static int findBits(BitSet bits) {
	    int count=0;
	    for (int i = 0; i < bits.length(); ++i) 
	      if(bits.get(i)) count++;
	    
	    return count;
	}
}
