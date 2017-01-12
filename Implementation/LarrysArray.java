package Implementation;


import java.util.*;

public class LarrysArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        
        for(int i=0;i<T;i++){
     	   int n=in.nextInt();
     	   int[] a=new int[n];
     	   for(int j=0;j<n;j++){
     		   a[j]=in.nextInt();
     	   }
     	   System.out.println(analyze(a,n));
        }
        
        in.close();
     }

 	private static String analyze(int[] a,int n) {
 		
 		int count=0;
 		for(int i=0;i<n;i++)
             for(int j=i+1;j<n;j++)
                 if(a[i]>a[j])
                     count++;
 		
 		if((count%2)==0)
 			return "YES";
 		return "NO";
 	}
}
