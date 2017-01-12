package Implementation;

import java.util.*;

public class Flatland {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		boolean[] a=new boolean[n];
		int[] b=new int[n];
		for(int i=0;i<m;i++)
			a[in.nextInt()]=true;
		
		int dist=0;
		for(int i=0;i<n;i++){
			if(a[i]) dist=0;
			b[i]=dist;
			dist++;
		}
		dist=Integer.MIN_VALUE;
		for(int i=n-1;i>=0;i--){
			if(dist==Integer.MIN_VALUE){
				if(a[i]){
					dist=0;
					b[i]=(dist<b[i]?dist:b[i]);
					dist++;
				}
			}
			else{
				if(a[i])dist=0;
				b[i]=(dist<b[i]?dist:b[i]);
				dist++;
			}
		}
		
		dist=Integer.MIN_VALUE;
		for(int i=n-1;i>=0;i--)
			if(dist<b[i])
				dist=b[i];
		
		System.out.println(dist);
    }
}
