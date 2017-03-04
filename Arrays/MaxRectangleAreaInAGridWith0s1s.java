package Arrays;

import java.util.*;

/*
 * Maximum size rectangle binary sub-matrix with all 1s
	Given a binary matrix, find the maximum size rectangle binary-sub-matrix with all 1’s.
	
	Input :   0 1 1 0
	          1 1 1 1
	          1 1 1 1
	          1 1 0 0
	
	Output :  8
	
	hint: use Max Histogram logic to find the max rectangle
 */

public class MaxRectangleAreaInAGridWith0s1s {

	public static void main(String[] args){
		int[][] arr={
				{1,0,1,0,1,0},
				{1,0,1,1,1,1},
				{1,1,1,1,1,0},
				{1,1,1,0,1,0},
				{1,0,1,1,1,0},
				{1,0,1,1,1,0},
		};
		System.out.println(maxArea(arr));
	}

	private static int maxArea(int[][] arr) {
		int r=arr.length;
		int c=arr[0].length;
		
		int[] histo=new int[c];
		int maxArea=Integer.MIN_VALUE;
		for(int i=0;i<r;i++){
			
			for(int j=0;j<c;j++){
				if(arr[i][j]!=0)
					histo[j]+=arr[i][j];
				else
					histo[j]=0;
			}
			maxArea=Math.max(maxArea, maxHisto(histo));
		}
		
		return maxArea;
	}

	private static int maxHisto(int[] histo) {
		int max=Integer.MIN_VALUE;
		Stack<Integer> s=new Stack<Integer>();
		int i=0;
		for(;i<histo.length;){
			
			if(s.isEmpty() || histo[s.peek()]<=histo[i]){
				s.push(i);
				i++;
			}
			else{
				
				int top=s.pop();
				int area=(i*histo[top]);
				
				if(!s.isEmpty()){
					area=(histo[top]*(i-s.peek()-1));
				}
				max=Math.max(max, area);		
			}
		}
		
		while(!s.isEmpty()){
			int top=s.pop();
			int area=(i*histo[top]);
			
			if(!s.isEmpty()){
				area=(histo[top]*(i-s.peek()-1));
			}
			max=Math.max(max, area);
		}
		return max;
	}
}
