package Search;

import java.util.*;

public class SimilarPair {

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

		return doDFS(vertices,k,vertices[root],new ArrayList<vertex>());
	}
	
	private static int doDFS(vertex[] vertices,int k,vertex v,ArrayList<vertex> ancestors){
		
		int count=0;
		ancestors.add(v);
		v.visited=true;
		for(int i=0;i<v.neighbors.size();i++){
			vertex vv=v.neighbors.get(i);
			if(!vv.visited)
				count+=doDFS(vertices,k,vv,ancestors);
		}
		ancestors.remove(v);
		for(int i=0;i<ancestors.size();i++){
			if(Math.abs(v.value-ancestors.get(i).value)<=k)
				count++;
		}
		return count;
	}
}



