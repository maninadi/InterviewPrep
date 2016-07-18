package Implementation;



import java.lang.reflect.Array;
import java.util.*;

public class BomberMan {
	
	static HashMap<Character,Character> hm=new HashMap<Character,Character>();
	static int[][] d=new int[][]{{0,-1},{0,1},{-1,0},{1,0}};
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		hm.put('.','O');
		hm.put('O','.');
		int R=in.nextInt();
		int C=in.nextInt();
		int N=in.nextInt();
		
		char[][] inboard=new char[R][];
		char[][] outboard=new char[R][];
		char[][] Altboard=new char[R][];
		for(int i=0;i<R;i++){
			String s=in.next();
			inboard[i]=s.toCharArray();
			outboard[i]=new char[C];
			Altboard[i]=new char[C];
			Arrays.fill(Altboard[i], 'O');
			Arrays.fill(outboard[i], 'O');
		}
		in.close();
	
		
		if(N<2)
			printBoard(inboard);
		else if(N==2)
			printBoard(outboard);
		else
			getNthBoard(inboard,outboard,Altboard,N);
	}
	
	static void printBoard(char[][] board){
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				System.out.print(board[i][j]);
			}
			System.out.println("");
		}
	}
	
	static void getNthBoard(char[][] inboard,char[][] Altboard,char[][] outboard,int N){
		
		if(N%2==0){
			printBoard(outboard);
			return;
		}
		
		blastBoard(inboard, Altboard);
		blastBoard(Altboard, outboard);
		
		boolean original=((((N-1)/2)%2)!=0);
		if(original)
			printBoard(Altboard);
		else
			printBoard(outboard);
		
	}
	
	private static void blastBoard(char[][] inboard,char[][] outboard){
		for(int i=0;i<inboard.length;i++)
			for(int j=0;j<inboard[0].length;j++)
				if(inboard[i][j]=='O')
					blast(inboard,outboard,i,j);
	}
	

	private static void blast(char[][] inboard,char[][] outboard, int i, int j) {
		
		for(int k=0;k<4;k++){
			int row=(i+d[k][0]);
			int col=(j+d[k][1]);
			if(isSafe(outboard,row,col))
				outboard[row][col]='.';
		}
		outboard[i][j]='.';
	}
	
	private static boolean isSafe(char[][] a, int row, int col) {
		if(row<0 || row>=a.length)
			return false;
		if(col<0 || col>=a[0].length)
			return false;
		return true;
	}
}
