package Arrays;

import java.util.*;

public class TugOfWar {
	
	public static void main(String[] args){
		
		int[] arr={3, 4, 5, -3, 100, 1, 89, 54, 23, 20};
		split(arr);
		
		for(int i=0;i<arr.length;i++){
			
			System.out.print(arr[i]+" ");
			if(i==(arr.length/2)-1)
				System.out.println("");
		}
	}

	static void split(int[] arr){
		
		Arrays.sort(arr);
		
		int i=0;
		int j=arr.length-1;
		while(i<j){
			
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			i+=2;
			j-=2;
		}
	}
}
