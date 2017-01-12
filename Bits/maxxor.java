package Bits;

import java.util.Scanner;

public class maxxor {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int R = in.nextInt();
        int k=Integer.MIN_VALUE;
        for (int i = L; i <= R; i++) {
        	for (int j = i+1; j <= R; j++) {
        		if((i^j)>k)
        			k=i^j;
        	}
            
        }
        in.close();
        System.out.println(k);
    }
}
