import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
/*        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input=br.readLine();
            if(checkBalance(input)){
                System.out.println("True");	    
            }
            else{
                System.out.println("False");	
            }
            
        }
        catch(Exception e){
            
        }
		int n=22;
    	int len=String.valueOf(n).length();
    	int total=0;
    	for(int i=0;i<len;i++){
    		 total+=count2s(n, i);
    	}
    	System.out.println(total);

    	int[] a={6,5,4,3,7,6,1};
    	getPairs(a,10);
    }

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
             try{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String input=br.readLine();
                int count=Integer.parseInt(input);
                for(int i=0;i<count;i++){
                    input=br.readLine();
                    System.out.println(checkThis(input));
                }
                
            }
            catch(Exception e){
                
            }
        }
        
        static int checkThis(String input){
            if(input.length()==0)
                return -1;
            int index=-1;
            StringBuilder sb=new StringBuilder(input);
            String inReverse=sb.reverse().toString();
            
            if(input.equalsIgnoreCase(inReverse))
            	return -1;

            int start=0;
            int end=input.length()-1;
            while(start<=end){
                char sC=input.charAt(start);
                char eC=input.charAt(end);
                if(sC!=eC){
                    if(eC==input.charAt(start+1)){
                        index=start;
                        start++;
                    }else if (sC==input.charAt(end-1)){
                        index=end;
                        end--;
                    }else{
                        end--;
                        start++;
                    }
                        
                }else{
                    end--;
                    start++;
                }
            }

            return index;
        }
    
    static void getPairs(int[] array,int sum){
    	HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
    	for(int i=0;i<array.length;i++){
    		if(!hm.containsKey(sum-array[i])){
    			hm.put(array[i], 0);
    		}else{
    			hm.put(sum-array[i], hm.get(sum-array[i])+1);
    		}
    	}
    	
    	for(int i:hm.keySet()){
    		if(hm.get(sum-array[i])>0){
    			System.out.println(i+" "+(sum-i));
    		}
    	}
    }

    
    static int count2s(int n,int d){
    	if(n==0) return 0;
    	
    	int count=0;
    	int powerof10=(int)Math.pow(10, d);
    	int nextPowerof10=powerof10*10;
    	int right=n%powerof10;
    	
    	int lower=n - n%nextPowerof10;
    	int upper=lower+nextPowerof10;
    	int digitVal=(n/powerof10)%10;
    	if(digitVal<2){
    		count=lower/10;
    	}else if(digitVal==2){
    		count=(lower/10)+right+1;
    	}else{
    		count=upper/10;
    	}
    	
    	return count;
    		
    }
    
    static boolean checkBalance(String input){
        if(input.length()%2>0)
            return false;
        Stack<Character> s=new Stack<Character>();
        int i=0;
        while(i<input.length()){
            char c1=input.charAt(i);
            if(!isClose(c1)){
                s.push(c1);
            }
            else{
                if(s.isEmpty())
                    return false;
                char c2=(char)s.pop();
                if(c1!=match(c2))
                    return false;
            }
            i++;
        }
        return true;
    }
    
    static char match(char c){
        switch(c){
            case '(': return ')';
            case '{': return'}';
            case '[': return ']';
        }
        return ' ';
    }
    static boolean isClose(char c){
        switch(c){
            case '}': 
            case ')': 
            case ']': 
            return true;
        }
        return false;
    }
}