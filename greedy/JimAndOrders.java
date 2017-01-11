package greedy;

import java.util.*;

public class JimAndOrders {

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		ArrayList<order> ll=new ArrayList<order>();
		
		for(int i=0;i<n;i++){
			order o=new order();
			o.t=in.nextInt();
			o.d=in.nextInt();
			o.id=i+1;
			o.e=o.t+o.d;
			ll.add(o);
		}
		in.close();
		ll.sort(new OrderComparator());
		for(order o:ll )
			System.out.print(o.id+" ");
	}
}

class order{
	int t=0;
	int d=0;
	int id=0;
	int e=0;
}

class OrderComparator implements Comparator<order>{
	
	@Override
	public int compare(order arg0, order arg1) {
		return arg0.e-arg1.e;
	}
}
