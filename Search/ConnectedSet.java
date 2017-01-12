package Search;

import java.util.Scanner;

public class ConnectedSet {
	
	static int[][] c=new int[][]{{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
	
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
   		System.out.println(runOneTestCase(in));
	}

	private static int runOneTestCase(Scanner in) {
		int k=0;
		int m=in.nextInt();
		int n=in.nextInt();
		int[][] a=new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				a[i][j]=in.nextInt();
			}
		}
		return searchRegion(a);
	}

	private static int searchRegion(int[][] a) {
		int largest=Integer.MIN_VALUE;
		int m=a.length;
		int n=a[0].length;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(a[i][j]!=-1){
					int count=doDFS(a,i,j,m,n);
					if(count>largest)
						largest=count;
				}
			}
		}
		return largest;
	}

	private static int doDFS(int[][] a,int i,int j,int m,int n) {
		if((i<0)||(i>=m)||(j<0)||(j>=n))
			return 0;
		if(a[i][j]==-1 || a[i][j]==0)
			return 0;
		a[i][j]=-1;
		int count=1;
		for(int k=0;k<8;k++){
			int row=(i+c[k][0]);
			int col=(j+c[k][1]);
			count+=doDFS(a,row,col,m,n);
		}
		return count;
	}
}

	
	
	
	
	
	
	
	
	