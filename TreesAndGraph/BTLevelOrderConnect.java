package TreesAndGraph;


import java.util.*;

public class BTLevelOrderConnect {

	
	static void connect(BTNode root){
	
		join(root);
		
	}

	private static void join(BTNode curr) {
		
		if(curr==null)
			return;
		
		if(curr.next!=null)
			join(curr.next);
		
		if(curr.left!=null){
			
			if(curr.right!=null){
				curr.left.next=curr.right;
				curr.right.next=getNextRight(curr);
			}
			else
				curr.left.next=getNextRight(curr);
			
			join(curr.left);
		}
		else if(curr.right!=null){
			curr.right.next=getNextRight(curr);
			join(curr.right);
		}
		else{
			join(getNextRight(curr));
		}
		
	}

	private static BTNode getNextRight(BTNode curr) {
		BTNode next=curr.next;
		while(next!=null){
			if(curr.left!=null)
				return curr.left;
			if(curr.right!=null)
				return curr.right;
			next=next.next;
		}
		return null;
	}
}
