package Implementation;

public class ReverseInt {

	public static void main(String[] args){
		
		System.out.println(reverse(123));
		System.out.println(reverse(1534236469));
		System.out.println(reverse(Integer.MAX_VALUE));
		System.out.println(reverse(Integer.MIN_VALUE));
	}
	
	static int reverse(int a) {
	    
	    long res=0;
	    long multi=a<0?-1:1;
	    a=Math.abs(a);
	    while(a>0){
	        res*=10;
	        res+=(a%10);
	        a/=10;
	    }
	    if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE)
	        res=0;
	    
	    return (int)(res*multi);
	}
}
