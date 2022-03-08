/*
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

	Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
	
	Note:
	You are not suppose to use the library's sort function for this problem.
	
	click to show follow up.
	
	Follow up:
	A rather straight forward solution is a two-pass algorithm using counting sort.
	First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.
	
	Could you come up with an one-pass algorithm using only constant space?
 */

import java.util.*;

public class DutchFlag {

	public static void main(String[] args){
		int[] a={0,1,2,2,1,0,2,2,2,1,1,1,0,0,0,1,2,0,1,1,2};
		
		sort(a);
		System.out.println(Arrays.toString(a));
	}

	private static void sort(int[] a) {
		
		int n=a.length-1;
		int low=0;
		int mid=0;
		int hi=n;
		
		while(mid<=hi){
			
			if(a[mid]==0){
				int temp=a[mid];
				a[mid]=a[low];
				a[low]=temp;
				low++;
				mid++;
			}
			else if(a[mid]==2){
				int temp=a[mid];
				a[mid]=a[hi];
				a[hi]=temp;
				hi--;
			}
			else if(a[mid]==1){
				mid++;
			}
						
			
		}
	}
}
