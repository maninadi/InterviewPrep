package Implementation;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LisasWorkbook {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int[] c=new int[n];
        for(int i=0;i<n;i++)
        	c[i]=in.nextInt();
        in.close();
        int page=1;
        int count=0;
        for(int i=0;i<n;i++){
        	int runningCount=1;
        	while(runningCount<=c[i]){
        		int start=runningCount;
        		int end=Math.min((runningCount+k-1),c[i]);
        		if(page>=start && page<=end)
        			count++;
        		runningCount+=k;
        		page++;
        	}
        }
        System.out.println(count);
    }
}
