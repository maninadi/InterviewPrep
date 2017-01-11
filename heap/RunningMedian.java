package heap;

import java.util.*;

public class RunningMedian {

    static PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();
	static PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>(1,Collections.reverseOrder());
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int a_i=0; a_i < n; a_i++){
			add(in.nextInt());
			System.out.println(printMedian());
		}
		in.close();
	}

	private static void add(int n) {
		
		if(minHeap.size()>0 && minHeap.peek()<n)
			minHeap.add(n);
		else
			maxHeap.add(n);
		int currLen=minHeap.size()+maxHeap.size();
		if(minHeap.size()>currLen/2)
			maxHeap.add(minHeap.poll());
		if(maxHeap.size()-minHeap.size()>1)
			minHeap.add(maxHeap.poll());
	}

	static double printMedian(){
		if((minHeap.size()+maxHeap.size())%2!=0)
			return maxHeap.peek();

		return (minHeap.peek()+maxHeap.peek())/2.0;
	}
}
