package Microsoft;

import java.util.*;

public class DetectLoop {

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		HashSet<Integer> hs=new HashSet<Integer>();
		int nextIndex=0;
		while(nextIndex<n){
			nextIndex+=a[nextIndex];
			if(hs.contains(nextIndex)){
				System.out.println("Has Loop at "+nextIndex);
				return;
			}
			else{
				hs.add(nextIndex);
			}
				
		}
		
		System.out.println("No Loop");
	}
}
