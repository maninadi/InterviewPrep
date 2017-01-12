package Search;

import java.util.Scanner;

public class EqualSum {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	int T=in.nextInt();
    	for(int i=1;i<=T;i++){
    		System.out.println(runOneTestCase(in));
    	}
    }

	private static String runOneTestCase(Scanner in) {
		int N=in.nextInt();
		int[] a=new int[N];
		long total=0;
		for(int i=0;i<N;i++){
			a[i]=in.nextInt();
			total+=a[i];
		}
		return analyze(a,total);
	}

	private static String analyze(int[] a,long total) {
		int i=0;
		long prefix=0;
		long suffix=total-a[0];
		if(prefix==suffix)
			return "YES";
		while(i<a.length-1){
			if(prefix==suffix)
				return "YES";
			prefix+=a[i];
			suffix-=a[i+1];
			i++;
		}
		return "NO";
	}
}
