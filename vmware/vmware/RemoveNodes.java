package vmware;

import java.io.IOException;
import java.util.Scanner;

public class RemoveNodes {

	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        LinkedListNode res;
        
        int _list_size = 0;
        _list_size = Integer.parseInt(in.nextLine());
        int _list_i;
        int _list_item;
        LinkedListNode _list = null;
        LinkedListNode _list_tail = null;
        for(_list_i = 0; _list_i < _list_size; _list_i++) { 
            _list_item = Integer.parseInt(in.nextLine().trim());
            if(_list_i == 0) {
        	_list = _insert_node_into_singlylinkedlist(_list, _list_tail, _list_item);
        	_list_tail = _list;
        }
        else {
        	_list_tail = _insert_node_into_singlylinkedlist(_list, _list_tail, _list_item);
        }
        }
        
        int _x;
        _x = Integer.parseInt(in.nextLine().trim());
        
        res = removeNodes(_list, _x);
        while (res != null) {
           System.out.println(res.val);
          res = res.next;
        }
        
    }
	
	
	
	 public static class LinkedListNode{
	        int val;
	        LinkedListNode next;
	    
	        LinkedListNode(int node_value) {
	            val = node_value;
	            next = null;
	        }
	    };
	    
	    public static LinkedListNode _insert_node_into_singlylinkedlist(LinkedListNode head, LinkedListNode tail, int val){
	        if(head == null) {
	            head = new LinkedListNode(val);
	            tail = head;
	        }
	        else {
	            tail.next = new LinkedListNode(val);
	            tail = tail.next;
	        }
	        return tail;
	    }
	    
	    
	    static LinkedListNode removeNodes(LinkedListNode list, int x) {

	        LinkedListNode newHead=null;
	        LinkedListNode end=null;
	        while(list!=null){
	        	LinkedListNode next=list.next;
	        	if(list.val<=x){
	        		if(newHead==null){
	        			newHead=list;
	        			end=newHead;
	        		}
	        		else{
	        			end.next=list;
	        			end=list;
	        		}
	        		list.next=null;
	        	}
	        	list=next;
	        }

	        return newHead;
	    }
}
