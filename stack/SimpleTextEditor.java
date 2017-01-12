package stack;

import java.util.*;

public class SimpleTextEditor {
	
    public static void main(String[] args) {
    
    	Scanner in = new Scanner(System.in);
    	
    	int q=in.nextInt();
    	
    	String s="";
    	Stack<String> stk=new Stack<String>();
    	
    	for(int i=0;i<q;i++){
    		int op=in.nextInt();
    		
    		switch(op){
    		
    		case 1:
    			stk.push(s);
    			String s1=in.next();
    			s+=s1;
    			break;
    		case 2:
    			stk.push(s);
    			int k=in.nextInt();
    			s=s.substring(0, s.length()-k);
    			break;
    		case 3:
    			k=in.nextInt();
    			System.out.println(s.charAt(k-1));
    			break;
    		case 4:
    			s=stk.pop();
    			break;
    			
    		}
    		
    	}
    	
    	
    	in.close();
    }
}
