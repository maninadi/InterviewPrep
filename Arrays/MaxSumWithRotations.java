package Arrays;

public class MaxSumWithRotations {

	public static void main(String[] args){
		int arr[] = {2,3,1};
		System.out.println(maxSum(arr));
	}
	
	static int maxSum(int[] arr){
		
		int max=0;
		int maxSum=0;
		int sum=0;
		int n=arr.length;
		for(int i=0;i<n;i++){
			maxSum+=(i*arr[i]);
			sum+=arr[i];
		}
		max=maxSum;
		for(int i=1;i<n;i++){
			maxSum=maxSum+sum-(arr[n-i]*n);
			max=Math.max(max, maxSum);
		}
		
		return max;
	}
}
