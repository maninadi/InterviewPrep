package Implementation;

import java.util.*;
public class AbsolutePerm {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();

        for(int i=1;i<=T;i++){
        	runTestCase(in);
        }
    }

	private static void runTestCase(Scanner in) {
        int n=in.nextInt();
        int k=in.nextInt();
        
        Integer[] a=new Integer[n+1];
        HashSet<Integer> hs=new HashSet<Integer>(); 
        for(int i=1;i<=n;i++){
        	int s1=(i-k)%n;
        	int s2=(i+k)%n;
        	s1=s1==0?n:s1;
        	s2=s2==0?n:s2;
        	int small=s1>s2?s2:s1;
        	int large=small==s1?s2:s1;
        	if(small>0 && !hs.contains(small)){
        		a[i]=small;
        		hs.add(small);
        	}
        	else if(large>0 && !hs.contains(large)){
        		a[i]=large;
        		hs.add(large);
        	}
        	else{
            	 System.out.println(-1);
            	 return;
        	}
        }
        
        for(int i=1;i<=n;i++){
        	if(Math.abs(i-a[i])!=k){
        	 System.out.println(-1);
        	 return;
        	}
        }
        
        for(int i=1;i<=n;i++)
        	System.out.print(a[i]+" ");
        System.out.println("");
	}
}
