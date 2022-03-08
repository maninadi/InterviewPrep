public class NumOfProvinces {
    
    void doDFS(boolean[] nodes, int x, int[][] matrix){
        for(int y=0; y<matrix.length; ++y){
            if(matrix[x][y] == 1 && !nodes[y]){
                nodes[y]=true;
                doDFS(nodes, y, matrix);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int provinces = 0;
        boolean[] nodes = new boolean[isConnected.length];

        for(int x=0; x<nodes.length; ++x){

            if(!nodes[x]){ //start of the province
                nodes[x] = true; 
                doDFS(nodes, x, isConnected);
                provinces++;
            }
            
        }
        return provinces;
    }
}
