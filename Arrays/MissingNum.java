package Arrays;

public class MissingNum {

	
	public static void main(String[] args){
		
		int[] a={0,2,1,3,5,6};
		System.out.println(findMissing(a));
	}
	
	static int findMissing(int[] a){
		
		int i=a.length;
		int n=0;
		while(i>0){
			i--;
			n^=((i+1)^a[i]);
		}
		
		return n;
	}
	
	
}
