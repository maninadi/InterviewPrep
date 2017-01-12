package Code21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class two {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int[] imps=new int[N];
        int[] nimps=new int[N];
        for(int i=0;i<N;i++){
        	int L=in.nextInt();
        	int T=in.nextInt();
        	if(T==0)
        		nimps[i]=L;
        	else
        		imps[i]=L;
        }
        int total=0;
        for(int i: nimps)
        	total+=i;
        Arrays.sort(imps);
        int multi=1;
        for(int i=N-1;i>=0;i--){
        	if((N-1-i)==K)
        		multi=-1;
        	total+=(multi*imps[i]);
        }
        System.out.println(total);

    }
}
