	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.util.ArrayList;



	public class backupDj {

		public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	     try{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	int T=getInt(br);
	    	ArrayList<ArrayList<Integer>> distances=new ArrayList<ArrayList<Integer>>();
	    	int[] s=new int[T];
	    	for(int i=0;i<T;i++){
	    		int bounds[]=getNM(br);
	    		int graph[][]=getGraph(br,bounds[0],bounds[1]);
	    		s[i]=getInt(br);
	    		s[i]--;
	            distances.add(getDistances(graph,s[i]));
	    	}
			printArray(distances,s);
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
	        		graph[r][c]=Integer.parseInt(s[2]);
	        		graph[c][r]=Integer.parseInt(s[2]);
	    		}
	    	}catch(Exception e){
	    		
	    	}  	
	    	return graph;
	    }
	    
	    static ArrayList<Integer> getDistances(int[][] graph,int s){
	    	int N=graph.length;
	    	ArrayList<Integer> dist=new ArrayList<Integer>();
	    	boolean list[]=new boolean[N];
	    	
	    	
	    	for(int i=0;i<N;i++){
	    		dist.add(Integer.MAX_VALUE);
	    		list[i]=false;
	    	}
	    		
	    	dist.set(s, 0);
	    	
	    	for(int i=0;i<N-1;i++){
	    		int minNode=getMinNode(dist,list);
	    		list[minNode]=true;
	    		for(int v=0;v<N;v++){
	    			if(!list[v] && graph[minNode][v]!=0){
	    				int altDist=graph[minNode][v]+(dist.get(minNode)==Integer.MAX_VALUE?0:dist.get(minNode));
	    				if(altDist<dist.get(v))
	    					dist.set(v,altDist);
	    			}
	    		}
	    	}
	    	
	    	return dist;
	    }
	    
	    static int getMinNode(ArrayList<Integer> d,boolean[] l){
	    	int min=Integer.MAX_VALUE;
	    	int minNode=-1;
	    	for(int i=0;i<d.size();i++){
	    		if(d.get(i)<=min && !l[i]){
	    			min=d.get(i);
	    			minNode=i;
	    		}
	    	}
	    	return minNode;
	    }
	    
	    static void printArray(ArrayList<ArrayList<Integer>> a,int[] s){
	    	for(int i=0;i<a.size();i++){
	    		for(int j=0;j<a.get(i).size();j++){
		            if(j!=s[i]){
		                if(a.get(i).get(j)==Integer.MAX_VALUE)
		                	a.get(i).set(j,-1);
		                System.out.print(a.get(i).get(j)+" ");
		            }
	    		}
	    	}
	    }
	    
	}
