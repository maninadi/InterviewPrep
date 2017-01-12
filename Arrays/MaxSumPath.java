package Arrays;

public class MaxSumPath {

	public static void main(String[] args){
		int[] arr1={2, 3, 7, 10, 12};
		int[] arr2={1, 5, 7, 8};
		System.out.println(maxSumPath(arr1,arr2));
	}
	
	static int maxSumPath(int[] arr1,int[] arr2){
		
		int maxSum=0;
		
		int i=0;
		int j=0;
		
		int runningSum1=0;
		int runningSum2=0;
		
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<arr2[j]){
				runningSum1+=arr1[i];
				i++;
			}
			else if(arr1[i]>arr2[j]){
				runningSum2+=arr2[j];
				j++;
			}
			else{
				maxSum+=Math.max(runningSum1, runningSum2);
				runningSum1=0;
				runningSum2=0;
				while(i<arr1.length && j<arr2.length && arr1[i]==arr2[j]){
					maxSum+=arr1[i];
					i++;
					j++;
				}
				
			}
		}
		
		while(i<arr1.length){
			runningSum1+=arr1[i];
			i++;
		}
			
		while(j<arr2.length){
			runningSum2+=arr2[j];
			j++;
		}
			
		maxSum+=Math.max(runningSum1, runningSum2);
		
		return maxSum;
	
	}
}
