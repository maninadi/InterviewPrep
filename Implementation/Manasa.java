package Implementation;

import java.util.*;

public class Manasa {

	public static void main(String[] args) {
        
		Scanner in = new Scanner(System.in);
		int T=in.nextInt();
		
		for(int i=0;i<T;i++){
			int n=in.nextInt();
			int a1=in.nextInt();
			int b1=in.nextInt();
			n--;
			int a=a1>b1?b1:a1;
            int b=a==a1?b1:a1;
			int j=0;
			while(j<=n){
				System.out.print((((n-j)*a)+(j*b))+" ");
				j++;
			}
			System.out.println("");
		}
		
		in.close();
    }
}
