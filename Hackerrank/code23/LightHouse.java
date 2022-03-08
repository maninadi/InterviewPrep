package code23;

import java.util.*;

public class LightHouse {

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		char[][] a= new char[n][n];
		for(int i=0;i<n;i++){
			String s=in.next();
			a[i]=s.toCharArray();
		}
		System.out.println(findR(a,n));
		in.close();
	}

	private static int findR(char[][] a, int n) {
		int max=0;
		for(int r=0;r<n;r++){
			for(int c=0;c<n;c++){
				if(a[r][c]=='.'){
					int k=findMax(a,r,c,n);
					if(k>max)
						max=k;
				}
			}
		}
		return max;
	}

	private static int findMax(char[][] a, int r, int c,int n) {
		int rad=0;
		while(true){
		
			int rStart=r-rad,rEnd=r+rad;
			int cStart=c-rad,cEnd=c+rad;
			if(rStart<0 || cStart<0) break;
			if(rEnd>=n || cEnd>=n) break;
			
			if(!checkRow(a,r,c,rStart,cStart,cEnd,rad)) break;
			if(!checkRow(a,r,c,rEnd,cStart,cEnd,rad)) break;
			if(!checkCol(a,r,c,cStart,rStart,rEnd,rad)) break;
			if(!checkCol(a,r,c,cEnd,rStart,rEnd,rad)) break;
			
			rad++;
		}
		return rad-1;
	}

	private static boolean checkCol(char[][] a,int r,int c, int col, int rStart, int rEnd,int rad) {
		for(int i=rStart;i<=rEnd;i++){
			if(isInside(r,c,i,col,rad) && a[i][col]=='*')
				return false;
		}
		return true;
	}

	private static boolean isInside(int x1, int y1, int x2, int y2,int rad) {
		int d1=x2-x1;
		int d2=y2-y1;
		int dis=(int) Math.ceil(Math.sqrt(Math.pow(d1,2)+Math.pow(d2,2)));
		return (dis<=rad);
	}

	private static boolean checkRow(char[][] a,int r,int c, int row, int cStart, int cEnd,int rad) {
		for(int i=cStart;i<=cEnd;i++){
			if(isInside(r,c,row,i,rad) && a[row][i]=='*')
				return false;
		}
		return true;

	}
}
