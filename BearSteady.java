import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashMap;


public class BearSteady {
	
	static HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	hm.put('A',0);
    	hm.put('C',1);
    	hm.put('T',2);
    	hm.put('G',3);
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	int T=getInt(br);
        	BufferedReader brfile = new BufferedReader(new FileReader("C:\\D\\MyPath\\aaaaa.txt"));
        	StringBuilder s=new StringBuilder();
        	for(String line; (line = brfile.readLine()) != null; ) {
        	        s.append(line);
        	}
        	//String s=br.readLine();
        	System.out.println(getLen(T,s.toString()));
         }catch(Exception e){
             
         }
    }
    static int getInt(BufferedReader br){
    	int T=0;
	  try{
	      String input=br.readLine();
	      T=Integer.parseInt(input);
	  }
	  catch(Exception e){
	      
	  }
	  return T;
    }
    
	static int getLen(int n, String s)
    {
		int max = n / 4;
		int subLen=Integer.MAX_VALUE;
		int[] cnt = new int[4];
		boolean isBalanced=true;
		for (char c: s.toCharArray()) {
			cnt[hm.get(c)]++;
			isBalanced=(isBalanced&&!(cnt[hm.get(c)]>max));
		}
		if (isBalanced) 			
			return 0;
		
		int start=0;
		for(int end=0;end<s.length();end++){
			cnt[hm.get(s.charAt(end))]--;
			while(isValid(cnt, max) && (start<=end) ){
				subLen=Math.min(subLen, end-start+1);
				cnt[hm.get(s.charAt((int)start))]++;
				start++;
			}
		}
		
        return subLen; 
    }
	
	static boolean isValid(int[] cnt,int max){
		for(char c:hm.keySet()){
			if(cnt[hm.get(c)]>max)
					return false;
		}
	 	return true;
	}

}
