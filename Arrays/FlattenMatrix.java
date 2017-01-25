package Arrays;

public class FlattenMatrix {

	public static void main(String[] args){
		
		int n=10;
		int m=4;
		int sum=0;
		int[][] a=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				sum++;
				a[i][j]=sum;
			}
		}
		
		int[] out=flatten(a);
		for(int i=0;i<out.length;i++){
			System.out.print(out[i]+" ");
		}
		
	}
	
	static int[] flatten(int[][] a){
		
		int n=a.length;
		int m=a[0].length;
		
		int[] out=new int[n*m];
		
		for(int i=0;i<n;i++){
			
			for(int j=0;j<m;j++){
				int k=(i*m)+j;
				out[k]=(i%2==0?a[i][j]:a[i][m-1-j]);
			}
			
			
		}
		
		
		return out;
	}
}
