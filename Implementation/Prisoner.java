package Implementation;

import java.util.*;

public class Prisoner {
	 public static void main(String[] args) {
	 
		 Scanner in = new Scanner(System.in);
		 int T=in.nextInt();
		 
		 for(int i=0;i<T;i++){
			 long N=in.nextInt();
			 long M=in.nextInt();
			 long S=in.nextInt();
			 long mod=((S+M-1)%N);
			 System.out.println(mod==0?N:mod);
		 }
		 
	 }
}
