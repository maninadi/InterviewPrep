package hourrank;

import java.util.Scanner;

public class StrangeCounter {

	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t=in.nextLong();
        long j=3;
        long i=0;
        long start=3;
        while(j<=t){
            i++;
            start=(3*(long)Math.pow(2,i));
            j+=start;
            System.out.println(start+" "+j);
        }
        
        System.out.println(1+(j-t));
        
        
    }
}
