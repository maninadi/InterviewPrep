import java.io.BufferedReader;
import java.io.InputStreamReader;


public class AngryProfessor {
	  public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		  try{
	          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	          int T=getInt(br);
              for(int j=0;j<T;j++){
                  runOneTestCase(br);
              }
	            
	        }
	        catch(Exception e){
	            
	        }
	   }
      static void runOneTestCase(BufferedReader br){
          int[] bounds=getNK(br);
          int N=bounds[0];
          int K=bounds[1];
          int total=0;
          int[] s=getNums(br,N);
          for(int i=0;i<N;i++){
              if(s[i]<=0)
                  total++;
          }
          System.out.println(total>=K?"NO":"YES");
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
	    static int[] getNK(BufferedReader br){
	    	int bounds[]=new int[2];
	    	try{
	    		String input=br.readLine();
	    		String[] s=input.split(" ");
	    		for(int i=0;i<2;i++){
	    			bounds[i]=Integer.parseInt(s[i]);
	    		}
	    	}catch(Exception e){
	    		
	    	}
	    	return bounds;
	    } 
	    static int[] getNums(BufferedReader br,int N){
	    	int nums[]=new int[N];
	    	try{
	    		String input=br.readLine();
	    		String[] s=input.split(" ");
	    		for(int i=0;i<s.length;i++){
	    			nums[i]=Integer.parseInt(s[i]);
	    		}
	    	}catch(Exception e){
	    		
	    	}
	    	return nums;
	    } 
}
