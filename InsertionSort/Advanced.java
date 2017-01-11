package InsertionSort;


import java.util.*;

public class Advanced {


	static private int count=0;
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int n=in.nextInt();
			int[] a=new int[n];
			for(int j=0;j<n;j++)
				a[j]=in.nextInt();

			
			mergeSort(a);
			System.out.println(count);
		}

	}
	static void mergeSort(int[] a){
		
		mergeSort(a,0,a.length-1);
	}
	static void mergeSort(int[] a, int l, int r){
	    if(r - l < 2)
	        return;
	    int mid = (l + r) / 2;
	    mergeSort(a,  l, mid);
	    mergeSort(a,  mid+1, r);
	    merge(a,l,r);   
	}

	static void merge(int a[],int i,int j)
	{
	    int ni=((i+j)/2)+1,nj=j+1;
	    int s=i;
	    int[] arr = new int [j-i+1];
	    j=ni;
	    int k=0;
	    while(i<ni && j<nj)
	    {
	        if(a[i]<=a[j])
	        {
	            arr[k]=a[i];
	            i++;
	        }
	        else
	        {
	            arr[k]=a[j];
	            count+=(ni-i);
	            j++;
	        }
	        k++;
	    }
	    for(;i<ni;i++,k++)
	        arr[k]=a[i];
	    for(;j<nj;j++,k++)
	        arr[k]=a[j];
	    for(k=0;s<nj;s++,k++)
	        a[s]=arr[k];
	}
}
