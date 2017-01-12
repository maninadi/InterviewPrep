package Strings;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class BisG {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int T=getInt(br);
    	for(int i=1;i<=T;i++){
    		System.out.println(nextPerm(br.readLine()));
    	}
     }catch(Exception e){
         e.printStackTrace();
     }

    }
    
    private static String nextPerm(String s) {
    	if(s.length()<=1)
    		return "no answer";
    	int sIndex=findSuffixIndex(s);
    	if(sIndex==-1)
    		return "no answer";
    	int swapIndex=findSwapIndex(s,sIndex);
    	s=swap(s,sIndex,swapIndex);
    	String prefix=s.substring(0, sIndex+1);
    	String suffix=s.substring(sIndex+1);
    	suffix=new StringBuilder(suffix).reverse().toString();
		return prefix+suffix;
	}

	private static String swap(String s, int sIndex, int swapIndex) {
		char[] arr=s.toCharArray();
		char temp=arr[sIndex];
		arr[sIndex]=arr[swapIndex];
		arr[swapIndex]=temp;
		return new String(arr);
	}

	private static int findSwapIndex(String s, int sIndex) {
		char c=s.charAt(sIndex);
		for(int i=s.length()-1;i>=sIndex;i--){
			if(s.charAt(i)>c){
				return i;
			}
		}
		return -1;
	}

	private static int findSuffixIndex(String s) {
		for(int i=s.length()-1;i>0;i--){
			if(s.charAt(i-1)<s.charAt(i)){
				return i-1;
			}
		}
		return -1;
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
