package Arrays;


/*
 * Find out the maximum sub-array of non negative numbers from an array.
	The sub-array should be continuous. That is, a sub-array created by choosing the second and fourth element and skipping the third element is invalid.
	
	Maximum sub-array is defined in terms of the sum of the elements in the sub-array. Sub-array A is greater than sub-array B if sum(A) > sum(B).
	
	Example:
	
	A : [1, 2, 5, -7, 2, 3]
	The two sub-arrays are [1, 2, 5] [2, 3].
	The answer is [1, 2, 5] as its sum is larger than [2, 3]
	NOTE: If there is a tie, then compare with segment's length and return segment which has maximum length
	NOTE 2: If there is still a tie, then return the segment with minimum starting index
 */
import java.util.*;

public class MaxSet {

	public static void main(String[] args){
		
		int[] arr={1, 2, 5, -7, 2, 3};
		
		ArrayList<Integer> a=maxset(arr);
		
		System.out.println(a.toString());
	}
	
	static ArrayList<Integer> maxset(int[] a) {
	    
	    long sum=0;
	    long max=Long.MIN_VALUE;
	    ArrayList<Integer> out=new ArrayList<Integer>();
	    ArrayList<Integer> temp=new ArrayList<Integer>();
	    for(int i:a){
	        if(i>=0){
	            sum+=i;
	            temp.add(i);
	        }
	        else {
	            if(sum>=max){
	                
	                //System.out.println(sum+" "+max+" "+temp.size()+" "+out.size());
	                if(max==sum){
	                    if(temp.size()>out.size()){
	                        out.clear();
	                        out.addAll(temp);
	                    }
	                }
	                else{
	                   out.clear();
	                   out.addAll(temp);
	                }
	                
	                max=sum;
	            }
                sum=0;
                temp.clear();
   	       }
	   }
	   
	   if(sum>=max){
	                
	                //System.out.println(sum+" "+max+" "+temp.size()+" "+out.size());
	                if(max==sum){
	                    if(temp.size()>out.size()){
	                        out.clear();
	                        out.addAll(temp);
	                    }
	                }
	                else{
	                   out.clear();
	                   out.addAll(temp);
	                }
	   }
	    
	    return out;   
	}
	
}
