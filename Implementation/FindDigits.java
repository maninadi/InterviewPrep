package Implementation;

import java.util.*;
public class FindDigits {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int a0 = 0; a0 < t; a0++){
	            int n = in.nextInt();
		        int n1=n;
		        
		        int count=0;
		        while(n1>0){
		        	int i=n1%10;
		        	if(i>0 && (n%i)==0)
		        		count++;
		        	n1=n1/10;
		        }
		        System.out.println(count);
	        }
	        in.close();
	    }
}
