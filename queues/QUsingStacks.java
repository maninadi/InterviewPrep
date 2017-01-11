package queues;

import java.util.*;

public class QUsingStacks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q=in.nextInt();
        MyQueue que=new MyQueue();
        for(int i=0;i<q;i++){
        	int op=in.nextInt();
        	switch(op){
        	case 1:
        		que.Enqueue(in.nextInt());
        		break;
        	case 2:
        		que.dequeue();
        		break;
        	case 3:
        		System.out.println(que.peek());
        	}
        }
        in.close();
    }
}

class MyQueue{
	private Stack<Integer> s1=new Stack<Integer>();
	private Stack<Integer> s2=new Stack<Integer>();
	
	public void Enqueue(int k){
		s1.push(k);
	}
	public void dequeue(){
		if(s2.isEmpty())
			shiftStacks(s1,s2);
		s2.pop();	
	}
	public int peek(){
		if(s2.isEmpty())
			shiftStacks(s1,s2);	
		return s2.peek();  
	}
	
	private void shiftStacks(Stack<Integer> from,Stack<Integer> to){
		while(!from.isEmpty())
			to.push(from.pop());
	}
}
