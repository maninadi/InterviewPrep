package Arrays;

public class IsArrayConsecutive {

	public static void main(String[] args){
		
		int arr[]={0,5,2,3,6};
		System.out.println(isConsecutive(arr));
	}
	
	static boolean isConsecutive(int[] arr){
		
		int[] res=getMinMax(arr);
		
		if(Math.abs(res[1]-res[0])+1!=arr.length)
			return false;
		
		for(int i=0;i<arr.length;i++){
			
			int k=Math.abs(arr[i]);
			k-=res[0];
			if(arr[k]<0)
				return false;
			arr[k]=-1*arr[k];
		}
		
		
		return true;
	}
	
	static int[] getMinMax(int[] arr){
		
		int[] res=new int[2];
		res[0]=Integer.MAX_VALUE;
		res[1]=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			res[0]=Math.min(res[0],arr[i]);
			res[1]=Math.max(res[1], arr[i]);
		}
		return res;
	}
}
