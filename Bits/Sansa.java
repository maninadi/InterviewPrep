package Bits;

import java.io.FileReader;
import java.util.Scanner;

public class Sansa {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int t=0;t<T;t++){
        	System.out.println(runtOneTestCase(in));
        }
        in.close();
		
        
    }

	private static int runtOneTestCase(Scanner in) {
        int N = in.nextInt();
        int[] ar=new int[N];
        for(int i=0;i<N;i++){
        	ar[i]=in.nextInt();
        }
        if(N%2==0)
        	return 0;
        int k=0;
        for(int i=0;i<ar.length;i+=2){
        	k^=ar[i];
        }
        return k;
	}

}
