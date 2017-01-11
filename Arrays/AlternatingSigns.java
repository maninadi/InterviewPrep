package Arrays;

public class AlternatingSigns {
	
	public static void main(String[] args){
		int[] arr={-1,-4,2,3,4,-2,-3,5};
		
		rearrange(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	static void rearrange(int[] arr){
		
		 int i=-1;
		 int j=0;
		 while(j<arr.length){
			 if(arr[j]<0){
				 i++;
				 swap(arr,i,j);
			 }
			 j++;
		 }
		 j=1;
		 i++;
		 while(i<arr.length && arr[j]<0){
			 swap(arr,i,j);
			 i++;
			 j+=2;
		 }
	}
	
	static void swap(int[] arr,int i,int j){
		int t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}
}
