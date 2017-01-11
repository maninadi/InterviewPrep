package ctci;

public class HasCycle {


	boolean hasCycle(Node head) {
    
		if(head==null) return false;
		Node normal=head;
		Node runner=head.next;
		
		while(normal!=null && runner!=null && runner.next!=null){
			if(normal==runner)
				return true;
			normal=normal.next;
			runner=runner.next.next;
		}
		
		return false;
	}
}

class Node {
    int data;
    Node next;
}