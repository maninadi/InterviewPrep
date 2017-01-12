package heap;

import java.util.*;

public class JesseAndCookies {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();
        for(int i=0;i<n;i++){
            minHeap.add(in.nextInt());
        }
        int count=0;
        while(!minHeap.isEmpty() && minHeap.peek()<k){
            if(minHeap.size()<=1){
                count=-1;
                break;
            }
                
            int last=minHeap.poll();
            int lastButOne=minHeap.poll();
            int newValue=(last+(2*lastButOne));
            minHeap.add(newValue);
            count++;
        }
        System.out.println(count);
    }
}
