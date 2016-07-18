package TreesAndGraph;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;


public class ShortestPath {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int T=getInt(br);
    	for(int i=1;i<=T;i++){
    		int bounds[]=getNM(br);
    		int graph[][]=getGraph(br,bounds[0],bounds[1]);
    		int s=getInt(br);
            s--;
    		int distances[]=getDistances(graph,s);
    		printArray(distances,s);
    	}
     }catch(Exception e){
         
     }

    }
    
    static int getInt(BufferedReader br){
	  int T=0;
	  try{
	      String input=br.readLine();
	      T=Integer.parseInt(input);
	  }
	  catch(Exception e){
	      
	  }
	  return T;
    }
    
    static int[] getNM(BufferedReader br){
    	int bounds[]=new int[2];
    	try{
    		String input=br.readLine();
    		String[] s=input.split(" ");
    		for(int i=0;i<2;i++){
    			bounds[i]=Integer.parseInt(s[i]);
    		}
    	}catch(Exception e){
    		
    	}
    	return bounds;
    }
    
    static int[][] getGraph(BufferedReader br,int N,int M){
    	int graph[][]=new int[N][N];
    	try{
    		for(int i=0;i<M;i++){
        		String input=br.readLine();
        		String[] s=input.split(" ");
        		int r=Integer.parseInt(s[0]);
        		int c=Integer.parseInt(s[1]);
        		r--;
        		c--;
        		graph[r][c]=6;
        		graph[c][r]=6;
    		}
    	}catch(Exception e){
    		
    	}  	
    	return graph;
    }
    
    static int[] getDistances(int[][] graph,int s){
    	int N=graph.length;
    	int dist[]=new int[N];
    	boolean list[]=new boolean[N];
    	
    	
    	for(int i=0;i<N;i++){
    		dist[i]=Integer.MAX_VALUE;
    		list[i]=false;
    	}
    		
    	dist[s]=0;
    	
    	for(int i=0;i<N-1;i++){
    		int minNode=getMinNode(dist,list);
    		list[minNode]=true;
    		for(int v=0;v<N;v++){
    			if(!list[v] && graph[minNode][v]!=0){
    				int altDist=graph[minNode][v]+(dist[v]==Integer.MAX_VALUE?0:dist[v]);
    				if(altDist<dist[v])
    					dist[v]=altDist;
    			}
    		}
    	}
    	
    	return dist;
    }
    
    static int getMinNode(int[] d,boolean[] l){
    	int min=Integer.MAX_VALUE;
    	int minNode=-1;
    	for(int i=0;i<d.length;i++){
    		if(d[i]<=min && !l[i]){
    			min=d[i];
    			minNode=i;
    		}
    	}
    	return minNode;
    }
    
    static void printArray(int[] a,int s){
    	for(int i=0;i<a.length;i++){
            if(i!=s){
                if(a[i]==Integer.MAX_VALUE)
                    a[i]=-1;
                System.out.print(a[i]+" ");
            }
    	}
    }
    
}
