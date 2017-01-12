package greedy;

import java.util.*;

public class GridChallenge {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<=t;i++){
        	int n=in.nextInt();
        	char[][] a=new char[n][n];
        	for(int j=0;j<n;j++){
        		String s=in.next();
        		a[j]=s.toCharArray();
        		Arrays.sort(a[j]);
        	}
        	System.out.println(checkColumns(a));
        }
        in.close();
    }

	private static String checkColumns(char[][] a) {
		for(int i=1;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				if(a[i-1][j]>a[i][j])
					return "NO";
			}
		}
		return "YES";
	}
    
}
