package linkedLists;

/*
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.

	For example:
	Given 1->2->3->4->5->NULL, m = 2 and n = 4,
	
	return 1->4->3->2->5->NULL.
	
	Note:
	Given m, n satisfy the following condition:
	1 <= m <= n <= length of list.
	
	Note 2:
	Usually the version often seen in the interviews is reversing the whole l
	inked list which is obviously an easier version of this question.
 */
public class ReverseBetween {
	
	
	public static void main(String[] args){
		
		
		ListNode one=new ListNode(83);
		ListNode two=new ListNode(13);
		ListNode three=new ListNode(21);
		ListNode four=new ListNode(72);
		
		one.next=two;
		two.next=three;
		three.next=four;
		
		one=reverseBetween(one, 1, 2);
		
		
		while(one!=null){
			System.out.format("%d ->",one.val);
			one=one.next;
		}
	}

	static ListNode reverseBetween(ListNode a, int m, int n) {
	  
		ListNode t=a;
		ListNode front=null;
		n-=m;
		m--;
		while(m>0 && t!=null){
			front=t;
			t=t.next;
			m--;
		}
		
		if(t==null){
		    return a;
		}
		
		
		ListNode prev=t;
		t=t.next;
		ListNode next=null;
		
		while(n>0 && t!=null){
			next=t.next;
			t.next=prev;
			prev=t;
			t=next;
			n--;
		}
		
		if(front!=null){
			front.next.next=t;
			front.next=prev;	
		}
		else{
			a.next=t;
			a=prev;
		}
		
		return a;
	    
	}
}

class ListNode {
  public int val;
  public ListNode next;
  ListNode(int x) { val = x; next = null; }
 }