package Implementation;

import java.util.Scanner;

public class SumPair {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int count=0;
        for(int i=0;i<a.length;i++)
        	for(int j=i+1;j<a.length;j++)
        		if((a[i]+a[j])%k==0)
        			count++;
        System.out.println(count);
    }
}
