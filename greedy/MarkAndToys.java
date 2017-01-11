package greedy;

import java.util.*;

public class MarkAndToys {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        Arrays.sort(a);
        long sum=0,count=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(sum<=k)
                count++;

        }
        System.out.println(count);
        in.close();
    }
}
