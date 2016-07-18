package Search;

import java.util.*;

public class SimilarPair1 {

	static long[] BIT=new long[100005];
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		vertex[] vertices=new vertex[n];
		int root=Integer.MIN_VALUE;
		for(int i=0;i<n-1;i++){
			int v1=in.nextInt();
			int v2=in.nextInt();
			if(root==Integer.MIN_VALUE)
				root=v1-1;
			if(vertices[v1-1]==null){
				vertices[v1-1]=new vertex();
				vertices[v1-1].value=v1;
			}
			if(vertices[v2-1]==null){
				vertices[v2-1]=new vertex();
				vertices[v2-1].value=v2;
			}
			vertices[v1-1].neighbors.add(vertices[v2-1]);
		}
		System.out.println(search(vertices,k,root));
	}

	private static int search(vertex[] vertices,int k,int root) {

		return doDFS(k,vertices.length,vertices[root]);
	}
	
	private static int doDFS(int k,int n,vertex v){
		
		int count=0;
		count+=bit_q(BIT,Math.max(1, n-k),Math.min(n, n+k));
		bit_up(BIT,n,v.value-1,1);
		for(int i=0;i<v.neighbors.size();i++){
			vertex vv=v.neighbors.get(i);
			count+=doDFS(k,n,vv);
		}
		bit_up(BIT,n,v.value,-1);
		return count;
	}
	
	static long bit_q(long[] bt,int i,int j)
	{
	    long sum=0;
	    while(j>0)
	    {
	        sum+=bt[j];
	        j -= (j & (j*-1));
	    }
	    i--;
	    while(i>0)
	    {
	        sum-=bt[i];
	        i -= (i & (i*-1));
	    }
	    return sum;
	}
	static void bit_up(long[] bt,int n,int i,long diff)
	{
	    while(i<=n)
	    {
	        bt[i] += diff;
	        i += (i & (i*-1));
	    }
	}

}

