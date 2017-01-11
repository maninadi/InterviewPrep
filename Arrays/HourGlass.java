package Arrays;

import java.util.*;

public class HourGlass {

	static int[][] offsets={{0,0},{0,1},{0,2},{1,1},{2,0},{2,1},{2,2}};
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        in.close();
        System.out.println(maxSum(arr));
    }
	
	static long maxSum(int[][] arr){
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				int s=sum(arr,i,j);
				if(max<s)
					max=s;
			}	
		}
		return max;
	}
	
	static int sum(int[][] arr,int i,int j){
		int s=0;
		for(int i1=0;i1<offsets.length;i1++){
			s+=arr[i+offsets[i1][0]][j+offsets[i1][1]];
		}
			
		return s;	
	}
}
