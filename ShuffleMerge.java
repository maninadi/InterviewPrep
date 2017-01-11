import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class ShuffleMerge {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int T=in.nextInt();
		for(int i=1;i<=T;i++){
			int N=in.nextInt();
			int[] a=new int[N];
			for(int j=0;j<N;j++){
				a[j]=in.nextInt();
			}
			analyze(a);
		}
		in.close();
    }
	
	static void analyze(int[] a){
		HashMap<Integer, ArrayList<Integer>> hm= new HashMap<Integer, ArrayList<Integer>>();
		for(int i=0;i<a.length;i++){
			if(!hm.containsKey(a[i]))
				hm.put(a[i], new ArrayList<Integer>());
			hm.get(a[i]).add(i);
		}
		BigInteger total=new BigInteger("0");
		for(int i:hm.keySet()){
			BigInteger n=new BigInteger(String.valueOf(hm.get(i).size()));
			if(n.longValue()>1){
				n=n.multiply(n.subtract(BigInteger.ONE));
				total=total.add(n);
			}
		}
		System.out.println(total.longValue());
	}
	

}
