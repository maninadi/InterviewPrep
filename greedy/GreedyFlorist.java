package greedy;

import java.util.*;

public class GreedyFlorist {

	public static void main( String args[] ){

		// helpers for input/output      

		Scanner in = new Scanner(System.in);

		int N, K;
		N = in.nextInt();
		K = in.nextInt();

		int C[] = new int[N];
		for(int i=0; i<N; i++){
			C[i] = in.nextInt();
		}

		Arrays.sort(C);
		int x=0;
		int result = 0;
		int cnt=0;
		for(int i=N-1;i>=0;i--){
			result+=((x+1)*C[i]);
			cnt++;
			if(cnt==K){
				cnt=0;
				x++;
			}
		}
			
		
		
		System.out.println( result );

	}
}
