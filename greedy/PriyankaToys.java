package greedy;

import java.util.*;

public class PriyankaToys {

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		Arrays.sort(a);
		int count=1;
		int e=a[0]+4;
		for(int i=0;i<n;i++){
			if(a[i]>e){
				e=a[i]+4;
				count++;
			}
		}
		System.out.println(count);
		in.close();
	}
}
