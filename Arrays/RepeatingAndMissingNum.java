package Arrays;

public class RepeatingAndMissingNum {

	public static void main(String[] args){
		//int[] arr={3,1,3};
		int[] arr={4, 3, 6, 2, 1, 1};
		RepAndMisNum(arr);
	}
	
	static void RepAndMisNum(int[] arr){
		
		int n=arr.length;
		int repeating=0;
		for(int i=0;i<n;i++){
			int k=Math.abs(arr[i])-1;
			if(arr[k]<0){
				repeating=k+1;
			}else{
				arr[k]*=-1;
			}
		}
		int missing=0;
		for(int i=0;i<n;i++){
			if(arr[i]>0){
				missing=i+1;
				break;
			}
		}
		System.out.println(missing+" "+repeating);
	}
}
