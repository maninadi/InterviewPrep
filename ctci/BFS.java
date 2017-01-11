package ctci;


import java.util.*;

public class BFS {

    public static class Graph {
        
        HashSet<Integer> visited=new HashSet<Integer>();
        int[] distances;
        int[][] adjacencyMatrix;
        int size=0;
        public Graph(int size) {
            this.size=size;
            distances=new int[size];
            Arrays.fill(distances,Integer.MAX_VALUE);
            adjacencyMatrix=new int[size][size];
        }

        public void addEdge(int first, int second) {
            adjacencyMatrix[first][second]=6;
            adjacencyMatrix[second][first]=6;
        }
        
        public int[] shortestReach(int startId) { // 0 indexed
            distances[startId]=0;
            
            for(int i=0;i<size-1;i++){
                int nodeWithMinDis=getMinNode();
                if(nodeWithMinDis==-1) break;
                visited.add(nodeWithMinDis);
                for(int j=0;j<size;j++){
                   if(hasToCheckNode(nodeWithMinDis,j)){
                      int altDist=calcAltDis(nodeWithMinDis,j);
                      if(altDist<distances[j])
                         distances[j]=altDist;
    			   }
                }
            }
            
            for(int i=0;i<size;i++){
            	if(distances[i]==Integer.MAX_VALUE){
            		distances[i]=-1;
            	}
            }
            return distances;
        }
        
        boolean hasToCheckNode(int i,int j){
           return (!visited.contains(j) && adjacencyMatrix[i][j]!=0);
        }
        
        int calcAltDis(int i,int j){
            return adjacencyMatrix[i][j]+(distances[i]==Integer.MAX_VALUE?0:distances[i]);
        }
        	
        int getMinNode(){
            int minDis=Integer.MAX_VALUE;
            int minNode=-1;
            for(int i=0;i<size;i++){
                if(!visited.contains(i) && minDis>distances[i]){
                    minNode=i;
                    minDis=distances[i];
                }
            }
            return minNode;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int queries = scanner.nextInt();
        
        for (int t = 0; t < queries; t++) {
            
            // Create a graph of size n where each edge weight is 6:
            Graph graph = new Graph(scanner.nextInt());
            int m = scanner.nextInt();
            
            // read and set edges
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt() - 1;
                int v = scanner.nextInt() - 1;
                
                // add each edge to the graph
                graph.addEdge(u, v);
            }
            
            // Find shortest reach from node s
            int startId = scanner.nextInt() - 1;
            int[] distances = graph.shortestReach(startId);
 
            for (int i = 0; i < distances.length; i++) {
                if (i != startId) {
                    System.out.print(distances[i]);
                    System.out.print(" ");
                }
            }
            System.out.println();            
        }
        
        scanner.close();
    }

}
