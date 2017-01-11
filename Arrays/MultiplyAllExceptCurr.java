package Arrays;

import java.util.*;

public class MultiplyAllExceptCurr {
	
	public static void main(String[] args){
		int[] arr={2,3,1,4};
		arr=multiAllExceptCurr(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	static int[] multiAllExceptCurr(int[] arr){
		
		int[] out=new int[arr.length];
		
		int product=1;
		out[0]=1;
		for(int i=1;i<arr.length;i++){
			product*=arr[i-1];
			out[i]=product;
		}
		
		product=1;
		for(int i=arr.length-2;i>=0;i--){
			product*=arr[i+1];
			out[i]*=product;
		}
		
		return out;
	}
}
