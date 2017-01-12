package Arrays;


public class ReorderArray {

	
	public static void main(String[] args){
		
		int arr[] = {50, 40, 70, 60, 90};
	    int index[] = {3,  0,  4,  1,  2};
	    
	    reorder(arr,index);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println("");
		for(int i=0;i<index.length;i++)
			System.out.print(index[i]+" ");
		
	}
	
	static void reorder(int[] arr,int[] index){
		int n=arr.length;
		if(n!=index.length)
			return;
		
		for(int i=0;i<n;i++){
			
			if(i!=index[i]){
				int oldIndex=index[index[i]];
				int oldVal=arr[index[i]];
				
				arr[index[i]]=arr[i];
				index[index[i]]=index[i];
				
				arr[i]=oldVal;
				index[i]=oldIndex;
				
			}
			
		}
	}
}
