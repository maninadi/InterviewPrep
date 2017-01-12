package TreesAndGraph;

public class BT2CircularLinkedList {

	public static void main(String[] args){
		
	}
	
	static BTNode convert(BTNode root){
		if(root==null)
			return null;
		
		if(root.left!=null && root.right!=null){
			root.left=root;
			root.right=root;
			return root;
		}
		
		BTNode left=convert(root.left);
		BTNode right=convert(root.right);
		
		root.left=root;
		root.right=root;
		
		left=join(left,root);
		left=join(left,right);
		
		return left;
	}

	private static BTNode join(BTNode r1, BTNode r2) {
		
		if(r1==null)
			return r2;
		
		if(r2==null)
			return r1;
		
		
		r1.left.right=r2;
		BTNode temp=r2.left;
		r2.left=r1.left;
		r1.left=temp;
		temp.right=r1;
		
		
		return r1;
	}
}


class BTNode{
	int data;
	BTNode left;
	BTNode right;
	BTNode next;
	
	BTNode(int d){
		this.data=d;
		this.left=null;
		this.right=null;
		this.next=null;
	}
}
