package DynamicProgramming;

import java.util.Scanner;

public class Candies {

	public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int N=in.nextInt();
       int[] a=new int[N];
       int[] count=new int[N];
       a[0]=in.nextInt();
       count[0]=1;
       for(int i=1;i<N;i++){
    	   a[i]=in.nextInt();
    	   if(a[i]>a[i-1])
    		   count[i]=count[i-1]+1;
    	   else
    		   count[i]=1;
       }
       in.close();
       for(int i=N-2;i>=0;i--){
    	   if(a[i]>a[i+1] && count[i]<=count[i+1])
    		   count[i]=Math.max(count[i+1]+1,count[i]+1);
       }
       long total=0;
       for(int i=0;i<N;i++)
    	   total+=count[i];
       
       System.out.println(total);

    }
}
