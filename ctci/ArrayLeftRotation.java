package ctci;

import java.util.Scanner;

public class ArrayLeftRotation {

	public static int[] arrayLeftRotation(int[] a, int n, int k) {
	      
        for(int i=1;i<=k;i++){
            int first=a[0];
            for(int j=0;j<n-1;j++){
                a[j]=a[j+1];
            }
            a[n-1]=first;
        }
        return a;
    }
	
	
	public static int[] arrayLeftRotation2(int[] a, int n, int m) {
	    
		int gcd=getGcd(n,m);
		int k=0;
		for(int i=0;i<gcd;i++){
			
			int j=i;
			int temp=a[j];
			while(true){
				k=j+m;
				if(k>=n)
					k-=n;
				if(k==i)
					break;
				a[j]=a[k];
				j=k;
			}
			a[j]=temp;
		}
        
        return a;
    }
    
    private static int getGcd(int n, int k) {
		if(k==0)
			return n;
		
		return getGcd(k,n%k);
	}


	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        in.close();
        int[] output = new int[n];
        output = arrayLeftRotation2(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
        
    }
}
