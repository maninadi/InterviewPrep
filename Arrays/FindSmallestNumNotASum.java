package Arrays;

public class FindSmallestNumNotASum {

	public static void main(String[] args){
		//int[] arr={1,1,1,1};
		int[] arr={1,3,3,4};
		System.out.println(find(arr));
	}
	
	static int find(int[] arr){
		
		int sum=1;
		
		for(int i=0;i<arr.length && arr[i]<=sum;i++)
			sum+=arr[i];
		
		return sum;
	}
}
