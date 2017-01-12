package queues;

import java.util.*;

public class TruckTour {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		Station[] sts=new Station[n];
		for(int i=0;i<n;i++){
			sts[i]=new Station();
			sts[i].gas=in.nextInt();
			sts[i].nextDistance=in.nextInt();
		}
		System.out.println(findMinStart(sts));
		in.close();
	}
	
	static int findMinStart(Station[] sts){
		
		int n=sts.length;
		int start=0;
		int end=1;
		Queue<Station> q=new LinkedList<Station>();
		int remainingPetrol=0;
		q.add(sts[start]);
		remainingPetrol+=(sts[start].gas-sts[start].nextDistance);
		while(start!=end){
			while(remainingPetrol<0){
				if(q.isEmpty())
					return -1;
				Station st=q.poll();
				remainingPetrol+=(st.nextDistance-st.gas);
				start++;
				start%=n;
			}
			q.add(sts[end]);
			remainingPetrol+=(sts[end].gas-sts[end].nextDistance);
			end++;
			end%=n;
		}
		
		
		return start;
	}
}

class Station{
	int gas=0;
	int nextDistance=0;
}