package Code21;

import java.util.Scanner;

public class one {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        if(v1<=v2){
        	System.out.println("NO");
        	return;
        }
        int k=(x2-x1)%(v1-v2);
        if(k==0)
        	System.out.println("YES");
        else
        	System.out.println("NO");
    }
}
