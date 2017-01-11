package heap;

import java.util.*;

public class QHEAP1 {

    static PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        int q=in.nextInt();
        for(int i=0;i<q;i++){
            int op=in.nextInt();
            switch(op){
                case 1:
                    int v=in.nextInt();
                    minHeap.add(v);
                    break;
                case 2:
                    v=in.nextInt();
                    minHeap.remove(v);
                    break;
                case 3:
                    System.out.println(minHeap.peek());
                    break;
            }
        }
        in.close();
    }
}
