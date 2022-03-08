
/*
 * A linked list is given such that each node contains an additional random pointer which
 *  could point to any node in the list or null.
	Return a deep copy of the list.
 */


public class CloneRandomList {
	
	
	public static void main(String[] agrs){
		RandomListNode one=new RandomListNode(1);
		/*RandomListNode two=new RandomListNode(2);
		RandomListNode three=new RandomListNode(3);
		RandomListNode four=new RandomListNode(4);
		RandomListNode five=new RandomListNode(5);
		
		/*one.next=two;
		two.next=three;
		three.next=four;
		four.next=five;
		
		one.random=three;
		two.random=one;
		three.random=five;
		four.random=five;
		five.random=two;
		*/
		
		one=clone(one);
		while(one!=null){
			
			System.out.format("%d %d %d\n",one.label,
					one.next!=null?one.next.label:-1,
					one.random!=null?one.random.label:-1);
			one=one.next;
		}
	}

	static RandomListNode clone(RandomListNode l){
		
		if(l==null)
			return null;
		RandomListNode curr=l;
		
		while(curr!=null){
			RandomListNode next=curr.next;
			curr.next=new RandomListNode(curr.label);
			curr.next.next=next;
			curr=next;
		}
		
		curr=l;
		
		while(curr!=null){
			RandomListNode next=curr.next;
			curr.next.random=curr.random!=null?curr.random.next:null;
			curr=next!=null?next.next:next;
		}
		
		curr=l;
		RandomListNode copy=l.next;
		RandomListNode head=l.next;
		while(curr!=null){
			
			curr.next=curr.next!=null?curr.next.next:curr.next;
			copy.next=copy.next!=null?copy.next.next:copy.next;
			
			copy=copy.next;
			curr=curr.next;
		}
		
		return head;
		
	}
}

class RandomListNode {
	int label;
    RandomListNode next, random;
    RandomListNode(int x) { this.label = x; }
};