package linkedLists;

/*
 * Given a linked list, remove the nth node from the end of list and return its head.

	For example,
	Given linked list: 1->2->3->4->5, and n = 2.
	After removing the second node from the end, the linked list becomes 1->2->3->5.
	
	Note:
	* If n is greater than the size of the list, remove the first node of the list.
	Try doing it using constant additional space.
 */
public class RemoveNthNodeFromEnd {

	
	public static void main(String[] args){
		ListNode one=new ListNode(83);
		ListNode two=new ListNode(13);
		ListNode three=new ListNode(21);
		ListNode four=new ListNode(72);
		
		one.next=two;
		two.next=three;
		three.next=four;
		
		one=removeNthFromEnd(one,2);
		
		
		while(one!=null){
			System.out.format("%d ->",one.val);
			one=one.next;
		}
	}
	
	
	static ListNode removeNthFromEnd(ListNode a, int b) {
	    
	    ListNode prev=null;
	    
	    ListNode fast=a;
	    ListNode slow=a;
	    while(b>0 && fast!=null){
	        fast=fast.next;
	        b--;
	    }
	    
	    if(fast==null){
	        return a.next;
	    }
	    
	    while(fast!=null){
	        prev=slow;
	        slow=slow.next;
	        fast=fast.next;
	    }
	    
	    if(prev!=null){
	        prev.next=slow.next;
	        
	    }
	    return a;
	}
	
	
}
