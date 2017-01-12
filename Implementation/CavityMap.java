package Implementation;

import java.util.*;
public class CavityMap {
	
	static int neighbors[][]={{-1,0},{0,1},{1,0},{0,-1}};
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[][] grid = new char[n][];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next().toCharArray();
        }
        findCavities(grid);
        print(grid);
    }

	private static void print(char[][] grid) {
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[0].length;j++){
				System.out.print(grid[i][j]);
			}
			System.out.println("");
		}
		
	}

	private static void findCavities(char[][] grid) {
		
		for(int i=1;i<grid.length-1;i++){
			for(int j=1;j<grid[0].length-1;j++){
				if(isCavity(grid,i,j))
					grid[i][j]='X';
			}
		}
		
	}

	private static boolean isCavity(char[][] grid, int i, int j) {
		for(int k=0;k<neighbors.length;k++){
			int r=i+neighbors[k][0];
			int c=j+neighbors[k][1];
			if(grid[r][c]=='X'||grid[r][c]>=grid[i][j])
				return false;
		}
		return true;
	}
	
	
}
