package Implementation;

import java.util.*;

public class SherlockSquares {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T=in.nextInt();
		for(int j=0;j<T;j++){
			int A=in.nextInt();
			int B=in.nextInt();
			int count=0;
			for(int i=(int)Math.sqrt((double)A);i<=(int)Math.sqrt((double)B);i++){
				int square=(int)Math.pow(i, 2);
				if(square>=A && square<=B)
					count++;
			}
			System.out.println(count);
		}
		in.close();
    }
}
