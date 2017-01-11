import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;


public class Sherlock {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int T=getInt(br);
    	for(int i=1;i<=T;i++){
    		System.out.println(FindPairs(br.readLine()));
    	}
     }catch(Exception e){
         e.printStackTrace();
     }

    }
    
    private static int FindPairs(String s) {
    	int count=0;
    	for(int i=0;i<s.length();i++){
    		for(int j=i+1;j<s.length();j++){
    			String s1=s.substring(i, j);
    			count+=FindAnagrams(s1,s.substring(i+1));
    		}
    	}
		return count;
	}
    private static int FindAnagrams(String s1,String s2){
    	int count=0;
    	int[] s1Freq=new int[26];
    	int[] s2Freq=new int[26];
    	for(int i=0;i<s1.length();i++){
    		s1Freq[s1.charAt(i)-'a']++;
    		s2Freq[s2.charAt(i)-'a']++;
    	}
    	int len=s1.length();
    	for(int i=0;i<s2.length()-len;i++){
    		if(countMatch(s1Freq,s2Freq))
    			count++;
    		s2Freq[s2.charAt(i)-'a']--;
    		s2Freq[s2.charAt(i+len)-'a']++;
    	}
		if(countMatch(s1Freq,s2Freq))
			count++;
    	return count;
    }

	private static boolean countMatch(int[] s1Freq, int[] s2Freq) {
		for(int i=0;i<s1Freq.length;i++){
			if(s1Freq[i]!=s2Freq[i])
				return false;
		}
		return true;
	}

	static int getInt(BufferedReader br){
	  int T=0;
	  try{
	      String input=br.readLine();
	      T=Integer.parseInt(input);
	  }
	  catch(Exception e){
		  e.printStackTrace();
	  }
	  return T;
    }
}
