
public class fnrmatrix {
	
	public static void main(String args[]){
		
		int a[][] = { {1,  2,  3,  3,  5,  6},
		              {7,  8,  9,  10, 11, 12},
		              {13, 14, 15, 16, 17, 18}
		         };
		removeFirst(a,3);
		fnr(a);
		
	}
	
	private static void fnr(int[][] m) {
		int rows=m.length;
		int cols=m[0].length;
		int i=0,j=0;
		while(i<rows && j<cols){
			;
			for(int k=j;k<cols;k++){
				System.out.print(m[i][k]+" ");
			}
			i++;
			
			for(int k=i;k<rows;k++){
				System.out.print(m[k][cols-1]+" ");
			}
			cols--;
			if(i<rows){
				for(int k=cols-1;k>=j;k--){
					System.out.print(m[rows-1][k]+" ");
				}
				rows--;
			}
			
			if(j<cols){
				for(int k=rows-1;k>=i;k--){
					System.out.print(m[k][j]+" ");
				}
				j++;
			}
					
		}
	}
	
	static void printM(int[][] m){
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[0].length;j++)
				System.out.print(m[i][j]+" ");
			System.out.println("");
		}
		System.out.println("---");
	}

	static void removeFirst(int[][] m,int remove){
		
		
		int rows=m.length;
		int cols=m[0].length;
		int i=0,j=0;
		boolean found=false;
		while(i<rows && j<cols){
			;
			for(int k=j;k<cols;k++){
				if(m[i][k]==remove)
					found=true;
				else if(found)
					m[i][k-1]=m[i][k];
			}
			i++;
			printM(m);
			for(int k=i;k<rows;k++){
				if(m[k][cols-1]==remove)
					found=true;
				else if(found)
					m[k-1][cols-1]=m[k][cols-1];
			}
			printM(m);
			cols--;
			if(i<rows){
				for(int k=cols-1;k>=j;k--){
					if(m[rows-1][k]==remove)
						found=true;
					else if(found)
						m[rows-1][k+1]=m[rows-1][k];
				}
				rows--;
				printM(m);
			}
			
			if(j<cols){
				for(int k=rows-1;k>=i;k--){
					if(m[k][j]==remove)
						found=true;
					else if(found)
						m[k+1][j]=m[k][j];

				}
				j++;	
				printM(m);
			}
			
			
		}
		
	}
	

}
