package Arrays;

public class Flip0sto1s2Max1s {

	public static void main(String[] args){
		
		int arr[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1};
		
		flipZeroes(arr, 2);
	}
	
	
	static void flipZeroes(int[] arr,int k){
		
		if(k==0)
			return;
		
		int start=0;
		int end=0;
		
		int maxLen=0;
		int bestStart=0;
		int used=0;
		while(end<arr.length){
			
			
			if(used<=k){
				if(arr[end]==0)
					used++;
				end++;
			}
			
			
			if(used>k){
				if(arr[start]==0)
					used--;
				start++;
			}
			
			if(maxLen<(end-start)){
				maxLen=end-start;
				bestStart=start;
			}
			
		}
		
		System.out.print(bestStart+" "+(bestStart+maxLen));
	}
}
