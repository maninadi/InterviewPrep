package Search;

import java.util.Scanner;

public class CountLuck {
	static int[][] c=new int[][]{{0,-1},{0,1},{-1,0},{1,0}};
	
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int T=in.nextInt();
    	for(int i=0;i<T;i++){
    		System.out.println(runOneTestCase(in));	
    	}
   		
	}

	private static String runOneTestCase(Scanner in) {
		int n=in.nextInt();
		int m=in.nextInt();
		char[][] a=new char[n][m];
		int[] start=new int[2];
		int[] end=new int[2];
		for(int i=0;i<n;i++){
			String s=in.next();
			a[i]=s.toCharArray();
			int mloc=s.indexOf("M");
			int sloc=s.indexOf("*");
			if(mloc!=-1){
				start[0]=i;
				start[1]=mloc;
			}
			if(sloc!=-1){
				end[0]=i;
				end[1]=sloc;
			}
				
		}
		int k=in.nextInt();
		return (searchRegion(a,start,end)==k)?"Impressed":"Oops!";
	}

	private static int searchRegion(char[][] a,int[] start,int[] end) {
		return doDFS(a,start[0],start[1],end[0],end[1]).count;
	}

	private static result doDFS(char[][] a,int i,int j,int n,int m) {
		if((i<0)||(i>=a.length)||(j<0)||(j>=a[0].length))
			return new result(0,false);
		if(a[i][j]=='X')
			return new result(0,false);
		if(a[i][j]=='*')
			return new result(0,true);

		a[i][j]='X';
		result res=new result(0,false);
		int count=-1;
		for(int k=0;k<4;k++){
			int row=(i+c[k][0]);
			int col=(j+c[k][1]);
			if(isSafe(a,row,col) &&  (a[row][col]=='.'||a[row][col]=='*'))
					count++;
		}
		count=(count<=0)?0:1;
		for(int k=0;k<4;k++){
			int row=(i+c[k][0]);
			int col=(j+c[k][1]);
			if(isSafe(a,row,col) &&  (a[row][col]=='.'||a[row][col]=='*')){
				if(!res.found)
					res=doDFS(a,row,col,n,m);
				if(res.found)
					break;
			}
		}
		res.count+=(res.found?count:0);
		return res;
	}

	private static boolean isSafe(char[][] a, int row, int col) {
		if(row<0 || row>=a.length)
			return false;
		if(col<0 || col>=a[0].length)
			return false;
		return true;
	}
}

class result{
	public int count=0;
	public boolean found=false;
	public result(int a,boolean b){
		this.count=a;
		this.found=b;
	}
}