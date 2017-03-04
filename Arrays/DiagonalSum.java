package Arrays;

/*
 * Find the difference in sum of the diagonals in a square matrix
 */


public class DiagonalSum {

	public static void main(String[] args){
		int[][] a={
				{1,4,7,10},
				{2,5,8,11},
				{3,6,9,12},
				{14,15,13,11}
		};
		
		System.out.println(diff(a));
	}

	private static int diff(int[][] a) {
		
		int front=0;
		int back=0;
		int n=a.length-1;
		int i=0;
		while(i<=n){
			front+=a[i][i];
			back+=a[i][n-i];
			i++;
		}
		System.out.println(front+" "+back);
		return front-back;
	}
}
