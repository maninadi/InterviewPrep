package Arrays;

public class IncreasingTripletSeq {

	public static void main(String[] args){
	
		//int[] arr={1, 2, 3, 4, 5};
		int[] arr={5, 4, 3, 2, 1, 6, 0, 0, 1, 8};
		System.out.println(isTheretriplet(arr));
	}
	
	
	static boolean isTheretriplet(int[] arr){
		
		int[] seq=new int[3];
		int len=0;
		
		int i=0;
		for(;i<arr.length;i++){
			int j=0;
			for(;j<len;j++){
				if(seq[j]>=arr[i]){
					break;
				}
			}
			if(j<len){
				seq[j]=arr[i];
			}
			else{
				seq[len]=arr[i];
				len++;
			}
			if(len==3)
				return true;
		}
		return false;
	}
			
}
