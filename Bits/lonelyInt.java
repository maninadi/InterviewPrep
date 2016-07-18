package Bits;

import java.util.Scanner;

public class lonelyInt {
    private static int lonelyInteger(int[] a) {
    	int k=a[0];
    	for(int i=1;i<a.length;i++){
    		k^=a[i];
    	}
        return k;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        in.close();
        System.out.println(lonelyInteger(a));
    }
}
