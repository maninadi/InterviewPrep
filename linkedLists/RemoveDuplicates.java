package linkedLists;

/*
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
	
	For example,
	Given 1->1->2, return 1->2.
	Given 1->1->2->3->3, return 1->2->3.
 */
public class RemoveDuplicates {

	public static void main(String[] args){
		
		ListNode one=new ListNode(1);
		ListNode two=new ListNode(1);
		ListNode three=new ListNode(2);
		ListNode four=new ListNode(2);
		
		one.next=two;
		two.next=three;
		three.next=four;
		
		one=deleteDuplicates(one);
		
		
		while(one!=null){
			System.out.format("%d ->",one.val);
			one=one.next;
		}
	}
	
	static ListNode deleteDuplicates(ListNode a) {
	    
	    if(a==null)
	         return null;
	    
	    ListNode head=a;
	    ListNode prev=a;
	    int prevVal=a.val;
	    a=a.next;
	    while(a!=null){
	        if(a.val==prevVal){
	            a=a.next;    
	        }
	        else{
	            prev.next=a;
	            prev=a;
	            prevVal=a.val;
	        }
	   }
	   prev.next=null;
	   return head;
	}
}
