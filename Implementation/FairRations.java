package Implementation;

import java.util.*;

public class FairRations {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        int count=0;
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
            if(B[B_i]%2!=0)
            	count++;
        }
        if(count==1 || (count%2!=0))
        	System.out.println("NO");
        else
        	System.out.println(findLoafs(B,count));
    }

	private static int findLoafs(int[] b,int n) {
		int count=0;
		int i=0;
		while(n>0 && i<b.length-1){
			if(b[i]%2!=0){
				b[i]++;
				n--;
				b[i+1]++;
				if(b[i+1]%2!=0)
					n++;
				count+=2;
			}
			i++;
		}
		
		return count;
	}
}
