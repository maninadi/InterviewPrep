import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;


public class BSG {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	String s1=br.readLine();
        	String s2=br.readLine();
        	System.out.println(longestChild(s1,s2));
         }catch(Exception e){
             e.printStackTrace();
         }
    }
    
    static int longestChild(String s1,String s2){
    	
    	int [][] matrix = new int[s1.length()][s2.length()];
    	int maxlen=0;
    	int count=0;
    	for(int i=0;i<s1.length();i++){
    		int j=0;
    		StringBuilder sb=new StringBuilder();
    		int start=i;
    		while(j<s2.length() && start<s1.length()){
    			char c1=s1.charAt(start);
    			char c2=s2.charAt(j);
    			if(c1==c2){
    				sb.append(c1);
    				start++;
    			}
    			j++;
    		}
			if(maxlen<sb.length())
				maxlen=sb.length();
    	}
    	
    	return maxlen;
    }
   
}
