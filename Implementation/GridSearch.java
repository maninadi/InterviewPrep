package Implementation;

import java.util.*;

public class GridSearch {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            char[][] G = new char[R][];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next().toCharArray();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            char[][] P = new char[r][];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next().toCharArray();
            }
            System.out.println(searchGrid(G,P));
        }
    }

	private static String searchGrid(char[][] g, char[][] p) {
		
		int R=g.length,C=g[0].length;
		int r=p.length,c=p[0].length;
		
		for(int i=0;i<=(R-r);i++){
			for(int j=0;j<=(C-c);j++){
				if(g[i][j]==p[0][0]){
					if(isAMatch(g,p,i,j))
						return "YES";
				}
			}
		}
		
		return "NO";
	}

	private static boolean isAMatch(char[][] g, char[][] p, int i, int j) {
		for(int i1=0;i1<p.length;i1++)
			for(int j1=0;j1<p[0].length;j1++)
				if(g[i+i1][j+j1]!=p[i1][j1])
					return false;
		return true;
	}
}
