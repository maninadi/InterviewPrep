package walmart;

public class SubSequence {

	public static void main(String[] args){
		
		int i=5;
		while(i<=1000){
			if(isPrime(i))
				System.out.print(i+" ");
			if(isPrime(i+2))
				System.out.print(i+2+" ");
			i+=6;
		}
	}

	private static boolean isPrime(int i) {
		if(i%5==0)
			return false;
		if(i%6==0)
			return false;
		return true;
	}
}
