package vmware;

import java.util.*;
public class OddEven {

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		
		a=mySort(a);
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		in.close();
	}

	private static int[] mySort(int[] a) {
		
		int oddIndex=0;
		int evenIndex=1;
		while(oddIndex<a.length && evenIndex<a.length){
			while(oddIndex<a.length && a[oddIndex]%2!=0)
				oddIndex+=2;
			if(oddIndex>=a.length-1)
				break;
			while(evenIndex<a.length && a[evenIndex]%2==0)
				evenIndex+=2;
			if(evenIndex>=a.length-1)
				break;
			int t=a[oddIndex];
			a[oddIndex]=a[evenIndex];
			a[evenIndex]=t;
		}
		return a;
	}
}
