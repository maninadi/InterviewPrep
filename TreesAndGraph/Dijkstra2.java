package TreesAndGraph;

import java.util.*;

public class Dijkstra2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t=in.nextInt();
		
		for(int k=0;k<t;k++){
			int n=in.nextInt();
			int m=in.nextInt();
			vertex[] g=new vertex[n];
			for(int i=0;i<n;i++)
				g[i]=new vertex();
			for(int i=0;i<m;i++){
				int x=in.nextInt();
				int y=in.nextInt();
				int r=6;
				r=(r<findValue(g,x-1,y-1)?r:findValue(g,x-1,y-1));
				g[x-1].neighbors.put(y-1,r);
				g[y-1].neighbors.put(x-1,r);
			}
			int s=in.nextInt();
			findDistances(g,s-1);
			System.out.println("");
		}
		in.close();
    }
	private static int findValue(vertex[] g,int i,int j){
		int x=Integer.MAX_VALUE;
		int y=Integer.MAX_VALUE;
		if(g[i].neighbors.containsKey(j))
			x=g[i].neighbors.get(j);
		if(g[j].neighbors.containsKey(i))
			y=g[j].neighbors.get(i);
		return (x<y)?x:y;
	}

	private static void findDistances(vertex[] g,int s) {
		
		int[] edges=new int[g.length];
		boolean[] included=new boolean[g.length];
		Arrays.fill(edges, -1);
		edges[s]=0;
		
		for(int i=0;i<g.length-1;i++){
			int start=finMinVertex(edges,included);
			included[start]=true;
			for(int v: g[start].neighbors.keySet()){
				if(!included[v]){
    				int altDist=g[start].neighbors.get(v)+(edges[start]==-1?0:edges[start]);
    				if(altDist<edges[v]||edges[v]==-1)
    					edges[v]=altDist;
    			}
			}
		}
		
		for(int i=0;i<edges.length;i++){
			if(i!=s)
				System.out.print(edges[i]+" ");
		}
		
	}

	private static int finMinVertex(int[] edges, boolean[] included) {
		int min=Integer.MAX_VALUE;
		int v=0;
		for(int i=0;i<edges.length;i++){
			if(!included[i] && edges[i]!=-1 && edges[i]<min){
				min=edges[i];
				v=i;
			}
		}
		return v;
	}
	
}

class vertex{
	HashMap<Integer,Integer> neighbors= new HashMap<Integer,Integer>();
}

