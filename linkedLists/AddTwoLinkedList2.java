package linkedLists;

public class AddTwoLinkedList2 {

	public static void main(String[] agrs){
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
	
	static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int l1Len=length(l1);
        int l2Len=length(l2);
        
        if(l1Len<l2Len){
            l1=padding(l1,l2Len-l1Len);
        }
        else if(l1Len>l2Len){
            l2=padding(l2,l1Len-l2Len);
        }
        
        Result res=doAddition(l1,l2);
        
        if(res.carry==0)
            return res.node;
        
        ListNode head=new ListNode(res.carry);
        
        head.next=res.node;
        
        return head;
        
    }
    
    static Result doAddition(ListNode l1,ListNode l2){
        if(l1==null && l2==null){
            return new Result();
        }
        
        Result interSum=doAddition(l1.next,l2.next);
        
        int val=l1.val+l2.val+interSum.carry;
        
        ListNode sum=new ListNode(val%10);
        sum.next=interSum.node;
        Result res=new Result();
        res.node=sum;
        res.carry=val/10;
        
        return res;
        
    }
    
    static ListNode padding(ListNode l,int padding){
        
        if(padding==0)
            return l;
            
        ListNode prev=new ListNode(0);
        ListNode head=prev;
        for(int i=1;i<padding;i++){
            prev.next=new ListNode(0);
            prev=prev.next;
        }
        prev.next=l;
        return head;
    }
    
    static int length(ListNode l){
        int len=0;
        
        while(l!=null){
            len++;
            l=l.next;
        }
        return len;
    }
}

class Result{
    ListNode node=null;
    int carry=0;
}

