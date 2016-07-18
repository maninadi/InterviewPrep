package Search;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class CutTheTree {

	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		int N=in.nextInt();
		vertex[] vertices=new vertex[N];
		long total=0;
		for(int i=0;i<N;i++){
			vertices[i]=new vertex();
			vertices[i].value=in.nextInt();
			total+=vertices[i].value;
		}
		for(int i=0;i<N-1;i++){
			int v1=in.nextInt();
			int v2=in.nextInt();
			vertices[v1-1].neighbors.add(vertices[v2-1]);
			vertices[v2-1].neighbors.add(vertices[v1-1]);
		}
		
		System.out.println(analyze(vertices,total));
	}

	private static long analyze(vertex[] vertices,long total) {
		long t1=0;
		long t2=total;
		long diff=Integer.MAX_VALUE;
		
		getRunningTotals(vertices[0]);
		
		clearStatus(vertices);
		Stack<vertex> s=new Stack<vertex>();
		s.push(vertices[0]);
		
		while(!s.isEmpty()){
			vertex v=s.pop();
			v.visited=true;
			for(int i=0;i<v.neighbors.size();i++){
				if(!v.neighbors.get(i).visited){
					s.push(v.neighbors.get(i));
					t1=total-v.neighbors.get(i).subTreeTotal;
					t2=v.neighbors.get(i).subTreeTotal;
					if(Math.abs(t1-t2)<diff)
						diff=Math.abs(t1-t2);
				}
			}
		}
		
		return diff;
	}

	private static void clearStatus(vertex[] vertices) {
		for(int i=0;i<vertices.length;i++)
			vertices[i].visited=false;
	}

	private static long getRunningTotals(vertex v) {
		if(v.neighbors.size()==0){
			v.subTreeTotal+=v.value;
			return v.subTreeTotal;
		}
		v.visited=true;
		for(int i=0;i<v.neighbors.size();i++){
			if(!v.neighbors.get(i).visited)
				v.subTreeTotal+=getRunningTotals(v.neighbors.get(i));
		}
		v.subTreeTotal+=v.value;
		return v.subTreeTotal;
	}
}

class vertex{
	int value;
	ArrayList<vertex> neighbors=new ArrayList<vertex>();
	boolean visited;
	long subTreeTotal=0;
}
