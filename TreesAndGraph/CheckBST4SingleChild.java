package TreesAndGraph;

public class CheckBST4SingleChild {

	
	public static void main(String[] args){
		
		int[] arr={20, 10, 11, 13, 12};
		
		System.out.println(checkBST(arr));
	}
	
	
	static boolean checkBST(int[] bst){
		
		for(int i=0;i<bst.length-1;i++){
			int succDiff=bst[i]-bst[i+1];
			int lastSuccDiff=bst[i]-bst[bst.length-1];
			if(succDiff * lastSuccDiff<0)
				return false;
		}
		
		return true;
	}
}
