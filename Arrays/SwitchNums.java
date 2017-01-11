package Arrays;

import java.util.*;

public class SwitchNums {

	public static void main(String[] args){
		int[] arr={3,2,0,1};
		switchNums(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
	static void switchNums(int[] arr){
		
		int n=arr.length;
		for(int i=0;i<n;i++)
			arr[i]+=(arr[arr[i]]%n*n);
		
		for(int i=0;i<n;i++)
			arr[i]=arr[i]/n;
	}
}
