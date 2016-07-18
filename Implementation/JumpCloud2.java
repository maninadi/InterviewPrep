package Implementation;

import java.util.*;
public class JumpCloud2 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        
        int i=0;
        int E=100;
        if(k>0){
            do{
                E--;
                if(c[i]==1)
                    E-=2;
                i+=k;
                i%=n;
            }while(i!=0);
        }
        System.out.println(E);
    }
}
