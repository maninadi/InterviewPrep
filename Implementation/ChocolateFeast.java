package Implementation;


import java.util.*;

public class ChocolateFeast {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            int count=n/c;
            n=count;
            while(n>=m){
            	count+=(n/m);
            	n=(n/m)+(n%m);
            }
            System.out.println(count);
        }
        in.close();
    }
}
