package Arrays;

public class MinDisBetweenTwoNumbers {

	public static void main(String[] a){
		int arr[] = {1, 2};
		System.out.println(maxDis(arr,1,2));
		int[] arr1 = {3, 4, 5};
		System.out.println(maxDis(arr1,3,5));
		int[] arr2={3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3};
		System.out.println(maxDis(arr2,3,6));
		int arr3[] = {2, 5, 3, 5, 4, 4, 2, 3};
		System.out.println(maxDis(arr3,3,2));
	}
	
	
	static int maxDis(int[] arr,int m,int n){
		
		int min=Integer.MAX_VALUE;
		int locM=Integer.MAX_VALUE;
		int locN=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++){
			
			locM=arr[i]==m?i:locM;
			locN=arr[i]==n?i:locN;
			
			min=Math.min(min, Math.abs(locM-locN));
			
		}
		return min;
	}
}
