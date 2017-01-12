package Arrays;

public class PeaksAndValley {

	public static void main(String[] args){
		int arr[] = {0,6,9,13,10,-1,8,2,4,14,-5};
		peaksAndValley(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
	}
	
	static void peaksAndValley(int[] arr){
		
		for(int i=1;i<arr.length;i+=2){
			int index=findLargeIndex(arr, i-1,i, i+1);
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
	}
	
	static int findLargeIndex(int[] arr,int a,int b,int c){
		
		int max=Math.max(arr[a], Math.max(arr[b], arr[c]));
		
		if(max==arr[a])
			return a;
		else if(max==arr[b])
			return b;
		else 
			return c;
		
	}
}
