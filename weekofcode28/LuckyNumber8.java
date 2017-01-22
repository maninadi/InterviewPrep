package weekofcode28;

import java.util.*;

public class LuckyNumber8 {

	static long DENOMINATOR = 1000000007;
	static long count=0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String number = in.next();
        perms(number,n);
        System.out.println(count);
    }
	private static void perms(String number,int n) {
	
		n = 1<<n;
		for(int i=1;i<n;i++){
			if(isPermMultiple(i,number)){
				count++;
				count%=DENOMINATOR;
			}
				
		}
	
	}
	private static boolean isPermMultiple(int i,String number) {
		StringBuilder s=new StringBuilder();
		int index=0;
		for(int k=i;k>0;k>>=1){
			if((k&1)==1){
				s.append(number.charAt(index));
			}
			index++;
		}
		try{
			long val=Long.parseLong(s.toString());
			if(val%8==0)
				return true;
		}catch(Exception e){
			
		}
		return false;
	}
}
