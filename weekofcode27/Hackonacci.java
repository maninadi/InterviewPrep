package weekofcode27;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hackonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        
        char[][] matrix=genMatrix(n);
        char[][] matrix2=genMatrix(n);
        
        rotate90(matrix2);
        int val90=compare(matrix,matrix2);
        
        rotate90(matrix2);
        int val180=compare(matrix,matrix2);
        
        rotate90(matrix2);
        int val270=compare(matrix,matrix2);
        for(int a0 = 0; a0 < q; a0++){
            int angle = in.nextInt();
            if(angle>=360) 
            	angle%=360;
            int k=0;
            if(angle==90)
            	k=val90;
            else if(angle==180)
            	k=val180;
            else if(angle==270)
            	k=val270;
            
            System.out.println(k);
        }
        
        
    }

	private static int compare(char[][] m1, char[][] m2) {
		int count=0;
		int n=m1.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(m1[i][j]!=m2[i][j])
					count++;
			}
		}
		return count;
	}

	private static void rotate90(char[][] res) {
		
		int n=res.length;
		
		for(int layer=0;layer<n/2;layer++){
			
			int first=layer;
			int last=n-1-layer;
			
			for(int i=first;i<last;i++){
				
				int offset=i-first;
				
				char top=res[first][i];
				res[first][i]=res[last-offset][first];
				res[last-offset][first]=res[last][last-offset];
				res[last][last-offset]=res[i][last];
				res[i][last]=top;
				
				
			}
		}
	}

	private static void printMatrix(char[][] matrix) {
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
		}
	}

	private static char[][] genMatrix(int n) {
		
		char[][] result=new char[n][n];
		
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				long k=(i+1)*(j+1);
				k*=k;
				int val=hackonacci(k);
				char c=val==1?'Y':'X';
				result[i][j]=c;
				result[j][i]=c;
			}
		}
		return result;
	}	

	private static int hackonacci(long k) {
		k%=7;
		int[] pre={1, 0, 0, 0, 0, 1, 1};
		return pre[(int) (k!=0?k-1:6)];
	}
}
