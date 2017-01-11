package greedy;

import java.util.*;

public class ArrayPermute {
	
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		
		int q=in.nextInt();
		
		for(int i=1;i<=q;i++){
			System.out.println(solveOne(in)?"YES":"NO");
		}
		
		in.close();
		
    }

	private static boolean solveOne(Scanner in) {
		int n=in.nextInt();
		int k=in.nextInt();
		Integer[] a=new Integer[n];
		Integer[] b=new Integer[n];
		getArr(in,a);
		getArr(in,b);
		Arrays.sort(a);
		Arrays.sort(b, Collections.reverseOrder());
		for(int i=0;i<n;i++){
			if(a[i]+b[i]<k)
				return false;
		}
		return true;
	}
	
	private static void getArr(Scanner in,Integer[] arr){
		for(int i=0;i<arr.length;i++)
			arr[i]=in.nextInt();
	}
	
}
