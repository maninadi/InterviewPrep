package weekofcode28;

import java.util.*;

public class GreatXOR {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            long x = in.nextLong();
            System.out.println(process(x));
        }
    }

	private static long process(long x) {
		long count=0;
		long i=1;
		
		while(x>1){
			if((x&1)==0){
				count+=i;
			}
			System.out.format("%5d %5d\n",i,x);
			i<<=1;
			x>>=1;
		}
		return count;
	}
}
