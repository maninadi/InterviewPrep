package Java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoDArray {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
            	sum=getSum(arr,i,j);
            	if(sum>maxSum)
            		maxSum=sum;
            }
        }
        System.out.println(maxSum);
    }

	private static int getSum(int[][] a, int i, int j) {
		int sum=0;
		sum+=a[i][j];
		sum+=a[i][j+1];
		sum+=a[i][j+2];
		sum+=a[i+1][j+1];
		sum+=a[i+2][j];
		sum+=a[i+2][j+1];
		sum+=a[i+2][j+2];
		return sum;
	}
}
