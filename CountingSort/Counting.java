package CountingSort;
import java.io.*;
import java.util.*;

public class Counting {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	  try{
              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
              String input=br.readLine();
              int N=Integer.parseInt(input);
              input=br.readLine();
              String[] values=input.split(" ");
              int ints[]=genArray(values);
              printArray(ints);
          }
          catch(Exception e){
              
          }
    }
    
    static int[] genArray(String[] values){
    	int[] ints=new int[100];
    	for(int i=0;i<values.length;i++){
    		try{
    			int k=Integer.parseInt(values[i]);
    			ints[k]++;
    		}catch(Exception e){
    			
    		}
    	}
    	return ints;
    }
    
    static void printArray(int[] ints){
    	for(int i=0;i<ints.length;i++){
    		System.out.print(ints[i]+" ");
    	}
    }
}