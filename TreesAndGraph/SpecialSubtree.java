package TreesAndGraph;

import java.util.*;

public class SpecialSubtree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n=in.nextInt();
		int m=in.nextInt();
		int[][] g=new int[n][n];
		for(int i=0;i<n;i++)
			Arrays.fill(g[i], Integer.MAX_VALUE);
		for(int i=0;i<m;i++){
			int x=in.nextInt();
			int y=in.nextInt();
			int r=in.nextInt();
			r=(r<g[x-1][y-1]?r:g[x-1][y-1]);
			g[x-1][y-1]=r;
			g[y-1][x-1]=r;
		}
		int s=in.nextInt();
		in.close();
		System.out.println(findMinGraph(g,s-1));
    }

	private static long findMinGraph(int[][] g,int s) {
		long sum=0;
		
		int[] edges=new int[g.length];
		boolean[] included=new boolean[g.length];
		Arrays.fill(edges, Integer.MAX_VALUE);
		edges[s]=0;
		
		for(int i=0;i<g.length-1;i++){
			int start=finMinVertex(edges,included);
			included[start]=true;
			for(int v=0;v<g.length;v++){
				if(g[start][v]!=Integer.MAX_VALUE && !included[v] && g[start][v]<=edges[v])
					edges[v]=g[start][v];
			}
		}
		
		for(int i=0;i<edges.length;i++)
			if(edges[i]!=Integer.MAX_VALUE)
				sum+=edges[i];
		return sum;
	}

	private static int finMinVertex(int[] edges, boolean[] included) {
		int min=Integer.MAX_VALUE;
		int v=0;
		for(int i=0;i<edges.length;i++){
			if(!included[i] && edges[i]<min){
				min=edges[i];
				v=i;
			}
		}
		return v;
	}

	
}

