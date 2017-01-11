package Arrays;

import java.util.*;

public class ABCSumEqualsK {

	public static void main(String[] args){
		
		//int[] arr={12, 3, 4, 1, 6, 9};
		int[] arr={1, 4, 45, 6, 10, 8};
		hasTriplet(arr, 22);
	}
	
	static boolean hasTriplet(int[] arr,int k){
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		int n=arr.length;
		
		for(int i=0;i<n;i++)
			hs.add(arr[i]);
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				int c=k-(arr[i]+arr[j]);
				if(hs.contains(c)){
					System.out.print(arr[i]+" "+arr[j]+" "+c);
					return true;
				}
			}
		}
		
		return false;
	}
}
