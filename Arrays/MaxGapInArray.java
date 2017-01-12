package Arrays;

public class MaxGapInArray {

	
	public static void main(String[] args){
		int[] arr={1,2,3,30,31,59};
		System.out.println(maxGap(arr));
	}
	
	static int maxGap(int[] arr){
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			max=Math.max(max, arr[i]);
			min=Math.min(min, arr[i]);
		}
		
		boolean[] buffer=new boolean [max-min+1];
		
		for(int i=0;i<arr.length;i++)
			buffer[arr[i]-min]=true;
		
		int diff=Integer.MIN_VALUE;
		
		while(!buffer[min])
			min++;
		
		int prev=min;
		
		while(min<max){
		
			while(!buffer[min])
				min++;
			
			diff=Math.max(diff, min-prev);
			prev=min;
			min++;
		}
		
		return diff;
	}
}
