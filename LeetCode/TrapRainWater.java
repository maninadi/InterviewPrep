package LeetCode;

/*
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
	For example, 
	Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 */

public class TrapRainWater {

	public static void main(String[] args){
		
		int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(maxVolume(arr));
	}

	static int maxVolume(int[] arr){
		
		if(arr==null || arr.length==0)
			return 0;
		
		int volume=0;
		int[] leftMaxes=new int[arr.length];
		leftMaxes[0]=arr[0];
		for(int i=1;i<arr.length;i++){
			leftMaxes[i]=Math.max(leftMaxes[i-1], arr[i]);
		}
		
		int right=arr[arr.length-1];
		
		for(int i=arr.length-2;i>=0;i--){
			right=Math.max(right, arr[i]);
			
			int interimMin=Math.min(right, leftMaxes[i]);
			
			if(interimMin>arr[i]){
				volume+=(interimMin-arr[i]);
			}
		}
		return volume;
	}
}
