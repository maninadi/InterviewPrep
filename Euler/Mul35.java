package Euler;

import java.util.Scanner;

public class Mul35 {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int i=0;i<T;i++){
			long N=in.nextInt();
			N--;
			long count3=N/3;
			long count5=N/5;
			long count15=N/15;
			long sum3=3*((count3*(count3+1))/2);
			long sum5=5*((count5*(count5+1))/2);
			long sum15=15*((count15*(count15+1))/2);
			System.out.println(sum3+sum5-sum15);
		}
		in.close();
    }
}
