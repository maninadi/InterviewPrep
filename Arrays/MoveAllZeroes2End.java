package Arrays;

import java.util.*;

public class MoveAllZeroes2End {
	
	public static void main(String[] args){
		int[] arr={1,0,1,0,1,0,1,0};
		moveZeroes(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	
	static void moveZeroes(int[] arr){
		int rightIndex=arr.length-1;
		int leftIndex=0;
		
		while(leftIndex<=rightIndex){
			while(arr[rightIndex]==0)
				rightIndex--;
			while(arr[leftIndex]!=0)
				leftIndex++;
			
			if(leftIndex>=rightIndex)
				break;
			
			int temp=arr[rightIndex];
			arr[rightIndex]=arr[leftIndex];
			arr[leftIndex]=temp;
			leftIndex++;
			rightIndex--;
		}
		
	}
}
