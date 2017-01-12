package Arrays;

public class DuplicateNoModification {

	public static void main(String[] args){
		
		int[] arr={3,1,3,4,2};
		
		System.out.println(findDuplicate(arr));
	}
	
	static int findDuplicate(int[] arr){
		
		int slow=arr[0];
		int fast=arr[arr[0]];
		while(slow!=fast){
			slow=arr[slow];
			fast=arr[arr[fast]];
		}
		
		slow=0;
		while(slow!=fast){
			slow=arr[slow];
			fast=arr[fast];
		}
		
		return fast;
	}
}
