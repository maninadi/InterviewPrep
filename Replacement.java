import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class Replacement {

	/*public static void main(String args[]){
		
		HashMap<Character, Character> hm=new HashMap<Character, Character>();
		hm.put('i', '1');
		hm.put('a', '@');
		hm.put('s', '8');
		hm.put('o', '0');
		hm.put('e', '&');
		HashSet<String> hs=new HashSet<String>();
		printStrings("aaaaaaa", hm,hs);
	}*/
	/* public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int v=Integer.MAX_VALUE;
	        int h=Integer.MAX_VALUE;
	        boolean xMatch=true;
	        boolean yMatch=true;
	        for(int a0 = 0; a0 < n; a0++){
	        	int x= in.nextInt();
	        	int y= in.nextInt();
	        	if(v!=Integer.MAX_VALUE){
	        		xMatch=(h==x)&& xMatch?true:false;
	        		yMatch=(v==y)&& yMatch?true:false;
	        	}else{
	        		h=x;
	        		v=y;
	        	}
	        }
	        if(xMatch||yMatch){
	            System.out.println("YES");
	        }else{
	            System.out.println("NO");
	        }
	    }*/
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int A[] = new int[n];
        int gcd=Integer.MAX_VALUE;
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
            if(gcd==Integer.MAX_VALUE)
                gcd=A[A_i];
            else
            	gcd=getGCD(gcd,A[A_i]);
        }
        int value=0;
        if(isPrime(gcd)&&gcd>k)
        	System.out.println(value);
        for(int i=k;i>Math.sqrt(k);i--){
          	if(getGCD(gcd,i)!=0){
        		value=i;
        		break;
        	}
        }
        System.out.println(value);

    }

	private static int getGCD(int gcd, int i) {
		int small=(gcd>i)?i:gcd;
		int large=(small==gcd)?i:gcd;
		int remainder=large%small;
		while(remainder!=0){
			large=small;
			small=remainder;
			remainder=large%small;
		}
		return small==1?0:small;
	}
	
	private static boolean isPrime(int n) {
		if(n<=1)
			return false;
		else if(n<=3)
			return true;
		else if((n%2==0)||(n%3==0))
			return false;
		int i=5;
		while(Math.pow(i, 2)<=n){
			if((n%i==0)||(n%(i+2)==0))
				return false;
			i+=6;
		}
		return true;
	}

	static void printStrings(String s,HashMap<Character, Character> hm,HashSet<String> hs){
		if(s.length()==0)
			return;
		if(hs.contains(s))
			return;
		else{
			hs.add(s);
			System.out.println(s);
		}
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(hm.containsKey(c)){
				String before=s.substring(0, i);
				String after=s.substring(i+1);
				printStrings(before+hm.get(c)+after,hm,hs);
			}
		}
		
	}

}
