package linkedLists;

public class InsertionSortLinkedList {

	public static void main(String[] args){
		
		ListNode one=new ListNode(83);
		ListNode two=new ListNode(13);
		ListNode three=new ListNode(21);
		ListNode four=new ListNode(72);
		
		one.next=two;
		two.next=three;
		three.next=four;
		
		one=insertionSortList(one);
		
		
		while(one!=null){
			System.out.format("%d ->",one.val);
			one=one.next;
		}
	}
	
	static ListNode insertionSortList(ListNode a) {
	    
	    if(a==null || a.next==null){
	        return a;
	    }
	    
	    ListNode head=null;
	    ListNode n=a;
	    while(n!=null){
	        ListNode curr=n;
	        n=n.next;
	        if(head==null|| curr.val<=head.val){
	            curr.next=head;
	            head=curr;
	        }
	        else{
	            
	            ListNode p=head;
	            
	            while(p.next!=null && curr.val>p.next.val){ 
	                p=p.next;
	            }
	            curr.next=p.next;
	            p.next=curr;
	        }
	    }
	    
	    return head;
	}
}
