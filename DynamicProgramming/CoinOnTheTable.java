package DynamicProgramming;


import java.util.*;

public class CoinOnTheTable {

	static int[][] dir={{-1,0},{0,-1},{1,0},{0,1}};
	static char[] chars={'U','L','D','R'};
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int k=in.nextInt();
        
        char[][] board=new char[n][];
        int r=-1;
        int c=-1;
        for(int i=0;i<n;i++){
        	String s=in.next();
        	board[i]=s.toCharArray();
        	if(c==-1){
        		c=s.lastIndexOf('*');
            	if(c!=-1)
            		r=i;
        	}
        		
        }
        int[][] res=calcMinOps(board,k);
        System.out.println(res[r][c]);
        in.close();
    }

	private static int[][] calcMinOps(char[][] board,int k) {
		int[][] result=new int[board.length][board[0].length];
        for(int i=0;i<result.length;i++){
            Arrays.fill(result[i],-1);
        }
		calcMinOps(board,result,k,0,0,0);
		return result;
	}

	private static void calcMinOps(char[][] board, int[][] result, int k,int ops,int i,int j) {
		if(i<0 || i>=board.length)
			return;
		if(j<0 || j>=board[0].length)
			return;
		if(board[i][j]=='x')
            return;
        
        result[i][j]=ops;
		
		if(k<=0)
			return;
		
		if(board[i][j]=='*')
			return;
        
        char curr=board[i][j];
		board[i][j]='x';			
		for(int l=0;l<dir.length;l++){
			int r=i+dir[l][0];
			int c=j+dir[l][1];
			if(curr==chars[l]){
				calcMinOps(board,result,k-1,ops,r,c);
			}
			else{
				calcMinOps(board,result,k-1,ops+1,r,c);
			}
		}
		
	}
}
