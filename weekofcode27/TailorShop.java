package weekofcode27;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TailorShop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        Arrays.sort(a);
        int sum=0;
        int prev=a[0]/p+(a[0]%p!=0?1:0);
        sum+=prev;
        for(int i=1;i<a.length;i++){
        	int k=a[i]/p+(a[i]%p!=0?1:0);
        	
        	if(prev>=k)
        		prev++;
        	else
        		prev=k;
        	
        	sum+=prev;
         }
        System.out.println(sum);
    }
}
