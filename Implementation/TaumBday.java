package Implementation;


import java.util.*;

public class TaumBday {

	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            long sum=0;
            if(x<y){
            	sum+=(b*x);
            	sum+=((w*y)<(w*(x+z))?w*y:w*(x+z));
            }
            else if(y<x){
            	sum+=(w*y);
            	sum+=((b*x)<(b*(y+z))?b*x:b*(y+z));
            }
            else{
            	sum+=(b*x);
            	sum+=(w*y);
            }
            System.out.println(sum);
        }
    }
}
