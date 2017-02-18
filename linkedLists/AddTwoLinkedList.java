package linkedLists;


/*
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

	Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
	Output: 7 -> 0 -> 8
	
	    342 + 465 = 807
	Make sure there are no trailing zeros in the output list
	So, 7 -> 0 -> 8 -> 0 is not a valid response even though the value is still 807.
 */

public class AddTwoLinkedList {

	public static void main(String[] args){
		
		ListNode first=new ListNode(9);
		first.next=new ListNode(9);
		first.next.next=new ListNode(1);
		
		ListNode second=new ListNode(1);
		
		first=addTwoNumbers(first,second);
		while(first!=null){
			System.out.format("%d ->",first.val);
			first=first.next;
		}
	}
	

	static ListNode addTwoNumbers(ListNode a,ListNode b){
	    ListNode num1=a;
	    ListNode num2=b;	    
	    if(num1==null || num2==null){
	        return num1==null?num2:num1;
	    }
	    
	    ListNode res=null;
	    ListNode p=null;
	    int carry=0;
	    int val=0;
	    while(num1!=null && num2!=null){
	        val=num1.val+num2.val+carry;
	        
	        if(p==null){
	            p=new ListNode(val%10);
	            res=p;
	        }
	        else{
	            p.next=new ListNode(val%10);
	            p=p.next;
	        }
	        carry=val/10;
	        num1=num1.next;
	        num2=num2.next;
	    }
	    
	    while(num1!=null){
	        val=num1.val+carry;
	        p.next=new ListNode(val%10);
	        p=p.next;
	        carry=val/10;
	        num1=num1.next;
	    }
	    
	    while(num2!=null){
	        val=num2.val+carry;
	        p.next=new ListNode(val%10);
	        p=p.next;
	        carry=val/10;
	        num2=num2.next;
	    }
	    
	    if(carry>0){
	        p.next=new ListNode(carry);
	    }
	    return res;
	}
	
}
