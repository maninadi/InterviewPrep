package InsertionSort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class Start {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int V=getInt(br);
    	int n=getInt(br);
    	int[] nums=getNums(br,n);
    	System.out.println(getIndex(nums,V));
     }catch(Exception e){
         e.printStackTrace();
     }

    }
    
    private static int getIndex(int[] nums,int v) {
    	for(int i=0;i<nums.length;i++){
    		if(nums[i]==v)
    			return i;
    	}
		return -1;
	}

	private static int[] getNums(BufferedReader br, int n) {
    	try{
    		String s=br.readLine();
    		String arr[]=s.split(" ");
    		int[] nums=new int[n];
    		for(int i=0;i<arr.length;i++){
    			nums[i]=Integer.parseInt(arr[i]);
    		}
    		return nums;
    	}catch(Exception e){
    		e.printStackTrace();
    	}
		
		return null;
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
}
