package linkedLists;

/*
 * Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

	You should preserve the original relative order of the nodes in each of the two partitions.
	
	For example,
	Given 1->4->3->2->5->2 and x = 3,
	return 1->2->2->4->3->5.
 */
public class PartitionLinkedList {

	public static void main(String[] args){
		ListNode one=new ListNode(83);
		ListNode two=new ListNode(13);
		ListNode three=new ListNode(21);
		ListNode four=new ListNode(72);
		
		one.next=two;
		two.next=three;
		three.next=four;
		
		one=partition(one,22);
		
		
		while(one!=null){
			System.out.format("%d ->",one.val);
			one=one.next;
		}
	}
	static ListNode partition(ListNode a, int b) {
	    
	    ListNode n=a;
	    
	    ListNode firstHalfStart=null;
	    ListNode secondHalfStart=null;
	    
	    ListNode firstHalfEnd=null;
	    ListNode secondHalfEnd=null;
	    while(n!=null){
	        
	        if(n.val<b){
	            
	            firstHalfStart=firstHalfStart==null?n:firstHalfStart;
	            
	            if(firstHalfEnd!=null){
	                firstHalfEnd.next=n;
	            }
	            firstHalfEnd=n;
	            
	        }
	        else{
	            
	            secondHalfStart=secondHalfStart==null?n:secondHalfStart;
	            
	            if(secondHalfEnd!=null){
	                secondHalfEnd.next=n;
	            }
	            secondHalfEnd=n;
	        }
	        n=n.next;
	    }
	    
	    if(firstHalfEnd!=null) 
	        firstHalfEnd.next=secondHalfStart;
	    if(secondHalfEnd!=null) 
	        secondHalfEnd.next=null;
	    return firstHalfStart!=null?firstHalfStart:secondHalfStart;
	}
}
